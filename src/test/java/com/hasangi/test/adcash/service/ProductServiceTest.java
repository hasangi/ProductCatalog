/**
 * 
 */
package com.hasangi.test.adcash.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hasangi.test.adcash.entity.Category;
import com.hasangi.test.adcash.entity.Product;
import com.hasangi.test.adcash.exception.ResourceNotFoundException;
import com.hasangi.test.adcash.repository.CategoryRepository;
import com.hasangi.test.adcash.repository.ProductRepository;

/**
 * @author hasan
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
	
	@InjectMocks
	@Autowired
	ProductService productService;;
	
	@MockBean
	ProductRepository productRepository;

	@MockBean
	CategoryRepository categoryRepository;
	
	@Test
	public void getProductsByCategoryIdTest(){
		int catId=12;
		Category _category=new Category(catId, "cat", "desc");
		when(categoryRepository.findById(catId)).thenReturn(Optional.of(_category));
		assertEquals(null,productService.getProductsByCategoryId(catId));
	}
	
	@Test
	public void saveTest(){
		Product product=new Product(25, "Item1", "Item descrption",2658.00f);
		when(productRepository.save(product)).thenReturn(product);
		assertEquals(product, productService.save(product));
	}
	
	@Test
	public void updateTest(){
		int id=25;
		Product product=new Product(id, "Item1", "Item descrption",2658.00f);
		Optional<Product> optio=Optional.of(product);
		when(productRepository.findById(id)).thenReturn(optio);
		when(productRepository.save(product)).thenReturn(product);
		assertEquals(product, productService.update(product,25));
	}
	
		
	@Test
	public void deleteTest(){
		int id=25;
		Product product=new Product(id, "Item1", "Item descrption",2658.00f);
		Optional<Product> optio=Optional.of(product);
		when(productRepository.findById(id)).thenReturn(optio);
		
		int catId=12;
		Category _category=new Category(12, "cat", "desc");
		product.setCategories(new HashSet<>());
		product.getCategories().add(_category);
		_category.setProducts(new HashSet<>());
		_category.getProducts().add(product);
		
		when(categoryRepository.findById(catId)).thenReturn(Optional.of(_category));
		
		Mockito.doNothing().when(productRepository).delete(product);
		assertEquals(true, productService.delete(id));
	}
	
		
	@Test
	public void getByIdTest(){
		int id=25;
		Product product=new Product(id, "Item1", "Item descrption",2658.00f);
		Optional<Product> optio=Optional.of(product);
		when(productRepository.findById(id)).thenReturn(optio);
		assertEquals(product,productService.getById(id));
	}
	
	@Test
	public void mapProductToCategoryTest()
	{
		int id=25;
		Product product=new Product(id, "Item1", "Item descrption",2658.00f);
		Optional<Product> optio=Optional.of(product);
		when(productRepository.findById(id)).thenReturn(optio);
		
		int catId=12;
		Category _category=new Category(12, "cat", "desc");
		product.setCategories(new HashSet<>());
		product.getCategories().add(_category);
		_category.setProducts(new HashSet<>());
		_category.getProducts().add(product);
		when(categoryRepository.findById(catId)).thenReturn(Optional.of(_category));
		
		assertEquals(product,productService.mapProductToCategory(id,catId));
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void mapProductToCategoryExceptionTest()
	{
		int id=25;
		int catId=12;
		when(productRepository.findById(id)).thenThrow(NoSuchElementException.class);
		productService.mapProductToCategory(id,catId);
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void getByIdExceptionTest(){
		int id=25;
		when(productRepository.findById(id)).thenThrow(NoSuchElementException.class);
		productService.getById(id);
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void deleteExceptionTest(){
		int id=25;
		when(productRepository.findById(id)).thenThrow(NoSuchElementException.class);
		assertEquals(true, productService.delete(id));
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void getProductsByCategoryIdExceptionTest(){
		int id=25;
		when(productRepository.findById(id)).thenThrow(NoSuchElementException.class);
		assertEquals(null,productService.getProductsByCategoryId(id));
	}
}
