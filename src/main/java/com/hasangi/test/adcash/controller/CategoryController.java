/**
 * 
 */
package com.hasangi.test.adcash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hasangi.test.adcash.entity.Category;
import com.hasangi.test.adcash.service.CategoryService;

/**
 * @author hasan
 *
 */
@RestController
@RequestMapping(value = { "/catalog" })
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = { "/getAll" }, method = { RequestMethod.GET }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Category>> getAll() {
		return ResponseEntity.ok().body(categoryService.getAllCategories());
	}

	@RequestMapping(value = { "/save" }, method = { RequestMethod.POST }, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Category> save(@RequestBody Category category) {
		Category _category = categoryService.save(category);
		return ResponseEntity.ok(_category);
	}

	@RequestMapping(value = { "/update" }, method = { RequestMethod.PUT }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Category> update(@RequestBody Category category) {
		Category _category = categoryService.update(category, category.getCategory_id());
		return ResponseEntity.ok(_category);
	}

	@RequestMapping(value = { "/delete/{id}" }, method = { RequestMethod.DELETE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Boolean> delete(@PathVariable("id") int category_id) {
		boolean result = categoryService.delete(category_id);
		return ResponseEntity.ok(result);
	}

	@RequestMapping(value = { "/getById/{id}" }, method = { RequestMethod.GET }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Category> getById(@PathVariable("id") int id) {
		return ResponseEntity.ok().body(categoryService.getById(id));
	}

}
