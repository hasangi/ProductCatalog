/**
 * 
 */
package com.hasangi.test.adcash.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hasangi.test.adcash.entity.Product;
import com.hasangi.test.adcash.service.ProductService;

/**
 * @author hasan
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductControllerTest {
	
	@InjectMocks
	@Autowired
	ProductController productController;
	
	@MockBean
	ProductService productService;
	
	@Before 
	public void setUp() {
	}   
	
	@Test
	public void getByCategoryTest(){
		int catId=12;
		when(productService.getProductsByCategoryId(catId)).thenReturn(null);
		assertEquals(200,productController.getByCategory(catId).getStatusCodeValue());
	}
	
	@Test
	public void saveTest(){
		Product product=new Product(25, "Item1", "Item descrption",2658.00f);
		when(productService.save(product)).thenReturn(product);
		assertEquals(200, productController.save(product).getStatusCodeValue());
	}
	
	@Test
	public void updateTest(){
		Product product=new Product(25, "Item1", "Item descrption",2658.00f);
		when(productService.update(product, 25)).thenReturn(product);
		assertEquals(200, productController.update(product).getStatusCodeValue());
	}
	
	@Test
	public void deleteTest(){
		int id=25;
		when(productService.delete(id)).thenReturn(true);
		assertEquals(true, productController.delete(id).getBody());
	}
	
	@Test
	public void getByIdTest(){
		int id=25;
		Product product=new Product(25, "Item1", "Item descrption",2658.00f);
		when(productService.getById(id)).thenReturn(product);
		assertEquals(200,productController.getById(id).getStatusCodeValue());
	}
	
	@Test
	public void mapProductToCategoryTest()
	{
		int product_id=25;
		int category_id=500;
		Product product=new Product(25, "Item1", "Item descrption",2658.00f);
		when(productService.mapProductToCategory(product_id, category_id)).thenReturn(product);
		assertEquals(200,productController.mapProductToCategory(product_id,category_id).getStatusCodeValue());
	}
}
