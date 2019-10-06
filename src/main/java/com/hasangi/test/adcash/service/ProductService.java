/**
 * 
 */
package com.hasangi.test.adcash.service;

import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasangi.test.adcash.entity.Category;
import com.hasangi.test.adcash.entity.Product;
import com.hasangi.test.adcash.exception.ResourceNotFoundException;
import com.hasangi.test.adcash.repository.CategoryRepository;
import com.hasangi.test.adcash.repository.ProductRepository;

/**
 * @author hasan
 *
 */
@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	CategoryRepository categoryRepository;

	public Set<Product> getProductsByCategoryId(int id) {
		try {
			return categoryRepository.findById(id).get().getProducts();
		} catch (NoSuchElementException ex) {
			throw new ResourceNotFoundException(id);
		}
	}

	public Product save(Product product) {
		return productRepository.save(product);

	}

	public Product update(Product product, int product_id) {
		Product _product = productRepository.findById(product_id).get();
		if (_product != null) {
			_product.setName(product.getName());
			_product.setDescription(product.getDescription());
			_product.setPrice(product.getPrice());
			return productRepository.save(_product);
		}
		return null;
	}

	public boolean delete(int product_id) {
		try {
			Product _product = productRepository.findById(product_id).get();
			if (_product != null) {
				Set<Category> categoryList = _product.getCategories();
				categoryList.stream().forEach(cat -> {
					Category _category = categoryRepository.findById(cat.getCategory_id()).get();
					Product pro = _category.getProducts().stream().filter(p -> (product_id == p.getProduct_id()))
							.findAny().orElse(null);
					if (pro != null) {
						_category.getProducts().remove(pro);
						categoryRepository.save(_category);
					}
				});
				productRepository.delete(_product);
				return true;
			}
			return false;
		} catch (NoSuchElementException ex) {
			throw new ResourceNotFoundException("Unable to delete Product Id:"+product_id);
		}
	}

	public Product getById(int product_id) {
		try {
			return productRepository.findById(product_id).get();
		} catch (NoSuchElementException ex) {
			throw new ResourceNotFoundException(product_id);
		}
	}

	public Product mapProductToCategory(int product_id, int category_id) {
		try {
			Category category = categoryRepository.findById(category_id).get();
			Product product = productRepository.findById(product_id).get();
			category.getProducts().add(product);
			product.getCategories().add(category);
			categoryRepository.save(category);
			return product;
		} catch (NoSuchElementException ex) {
			throw new ResourceNotFoundException("Unable to map prduct to category");
		}
	}

}
