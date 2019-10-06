/**
 * 
 */
package com.hasangi.test.adcash.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

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
import com.hasangi.test.adcash.exception.ResourceNotFoundException;
import com.hasangi.test.adcash.repository.CategoryRepository;

/**
 * @author hasan
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceTest {
	
	@InjectMocks
	@Autowired
	CategoryService categoryService;
	
	@MockBean
	CategoryRepository categoryRepository;
	
	@Test
	public void getAllTest(){
		when(categoryRepository.findAll()).thenReturn(null);
		assertEquals(null,categoryService.getAllCategories());
	}
	
	@Test
	public void saveTest(){
		Category _category=new Category(1,"Clothing","Clothing");
		when(categoryRepository.save(_category)).thenReturn(_category);
		assertEquals(_category, categoryService.save(_category));
	}
	
	@Test
	public void updateTest(){
		int id=1;
		Category _category=new Category(1,"Clothing","Clothing");
		Optional<Category> catOptional=Optional.of(_category);
		when(categoryRepository.findById(id)).thenReturn(catOptional);
		when(categoryRepository.save(_category)).thenReturn(_category);
		assertEquals(_category, categoryService.update(_category,1));
	}
	
	@Test
	public void deleteTest(){
		int id=1;
		Category _category=new Category(id,"Clothing","Clothing");
		Optional<Category> catOptional=Optional.of(_category);
		when(categoryRepository.findById(id)).thenReturn(catOptional);
		Mockito.doNothing().when(categoryRepository).delete(_category);
		assertEquals(true, categoryService.delete(id));
	}
	
	@Test
	public void getByIdTest(){
		int id=1;
		Category _category=new Category(1,"Clothing","Clothing");
		Optional<Category> catOptional=Optional.of(_category);
		when(categoryRepository.findById(id)).thenReturn(catOptional);
		assertEquals(_category,categoryService.getById(id));
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void updateExceptionTest(){
		int id=1;
		Category _category=new Category(1,"Clothing","Clothing");
		when(categoryRepository.findById(id)).thenThrow(NoSuchElementException.class);
		assertEquals(_category, categoryService.update(_category,1));
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void deleteExceptionTest(){
		int id=1;
		Category _category=new Category(id,"Clothing","Clothing");
		when(categoryRepository.findById(id)).thenThrow(NoSuchElementException.class);
		Mockito.doNothing().when(categoryRepository).delete(_category);
		assertEquals(true, categoryService.delete(id));
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void getByIdExceptionTest(){
		int id=1;
		Category _category=new Category(1,"Clothing","Clothing");
		when(categoryRepository.findById(id)).thenThrow(NoSuchElementException.class);
		assertEquals(_category,categoryService.getById(id));
	}
}
