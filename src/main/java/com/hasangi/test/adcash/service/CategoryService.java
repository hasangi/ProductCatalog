/**
 * 
 */
package com.hasangi.test.adcash.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasangi.test.adcash.entity.Category;
import com.hasangi.test.adcash.exception.ResourceNotFoundException;
import com.hasangi.test.adcash.repository.CategoryRepository;

/**
 * @author hasan
 *
 */
@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public Category save(Category category) {
		return categoryRepository.save(category);

	}

	public Category update(Category category, int category_id) {
		try {
			Category _category = categoryRepository.findById(category_id).get();
			_category.setName(category.getName());
			_category.setDescription(category.getDescription());
			return categoryRepository.save(_category);
		} catch (NoSuchElementException ex) {
			throw new ResourceNotFoundException(category_id);
		}
	}

	public boolean delete(int category_id) {
		try {
			Category _category = categoryRepository.findById(category_id).get();
			categoryRepository.delete(_category);
			return true;
		} catch (NoSuchElementException ex) {
			throw new ResourceNotFoundException(category_id);
		}
	}

	public Category getById(int category_id) {
		try {
			return categoryRepository.findById(category_id).get();
		} catch (NoSuchElementException ex) {
			throw new ResourceNotFoundException(category_id);
		}
	}

}
