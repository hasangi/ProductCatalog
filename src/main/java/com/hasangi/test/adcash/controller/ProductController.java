/**
 * 
 */
package com.hasangi.test.adcash.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hasangi.test.adcash.entity.Product;
import com.hasangi.test.adcash.service.ProductService;

/**
 * @author hasan
 *
 */
@RestController
@RequestMapping(value = { "/product" })
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = { "/getByCategoryId/{id}" }, method = { RequestMethod.GET }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Set<Product>> getByCategory(@PathVariable("id") int id) {
		return ResponseEntity.ok().body(productService.getProductsByCategoryId(id));
	}

	@RequestMapping(method = { RequestMethod.POST }, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Product> save(@RequestBody Product product) {
		Product _product = productService.save(product);
		return ResponseEntity.ok(_product);
	}

	@RequestMapping(value = { "/update" }, method = { RequestMethod.PUT }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Product> update(@RequestBody Product product) {
		Product _product = productService.update(product, product.getProduct_id());
		return ResponseEntity.ok(_product);
	}

	@RequestMapping(value = { "/delete/{id}" }, method = { RequestMethod.DELETE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Boolean> delete(@PathVariable("id") int product_id) {
		boolean result = productService.delete(product_id);
		return ResponseEntity.ok(result);
	}

	@RequestMapping(value = { "/getById/{id}" }, method = { RequestMethod.GET }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Product> getById(@PathVariable("id") int id) {
		return ResponseEntity.ok().body(productService.getById(id));
	}

	@RequestMapping(value = { "/mapProductToCategory/{product_id}/{category_id}" }, method = {
			RequestMethod.GET }, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Product> mapProductToCategory(@PathVariable("product_id") int product_id,
			@PathVariable("category_id") int category_id) {
		return ResponseEntity.ok().body(productService.mapProductToCategory(product_id, category_id));
	}

}
