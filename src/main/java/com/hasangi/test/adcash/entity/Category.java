/**
 * 
 */
package com.hasangi.test.adcash.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author hasan
 *
 */
@Entity
public class Category {

	@Id
	private int category_id;
	private String name;
	private String description;
	@ManyToMany
	@JoinTable(name = "category_product", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	@JsonIgnore
	Set<Product> products;

	public Category() {
	}

	public Category(int category_id, String name, String description) {
		super();
		this.category_id = category_id;
		this.name = name;
		this.description = description;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
