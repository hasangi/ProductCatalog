package com.hasangi.test.adcash.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hasangi.test.adcash.entity.Category;
import com.hasangi.test.adcash.service.CategoryService;

/**
 * @author hasan
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryControllerTest {
	
	@InjectMocks
	@Autowired
	CategoryController categoryController;
	
	@MockBean
	CategoryService categoryService;
	
	@Test
	public void getAllTest(){
		when(categoryService.getAllCategories()).thenReturn(null);
		assertEquals(200,categoryController.getAll().getStatusCodeValue());
	}
	
	@Test
	public void saveTest(){
		Category _category=new Category(1,"Clothing","Clothing");
		when(categoryService.save(_category)).thenReturn(_category);
		assertEquals(200, categoryController.save(_category).getStatusCodeValue());
	}
	
	@Test
	public void updateTest(){
		Category _category=new Category(1,"Clothing","Clothing");
		when(categoryService.update(_category, 1)).thenReturn(_category);
		assertEquals(200, categoryController.update(_category).getStatusCodeValue());
	}
	
	@Test
	public void deleteTest(){
		int id=1;
		when(categoryService.delete(id)).thenReturn(true);
		assertEquals(true, categoryController.delete(id).getBody());
	}
	
	@Test
	public void getByIdTest(){
		int id=1;
		Category _category=new Category(1,"Clothing","Clothing");
		when(categoryService.getById(id)).thenReturn(_category);
		assertEquals(200,categoryController.getById(id).getStatusCodeValue());
	}
}
