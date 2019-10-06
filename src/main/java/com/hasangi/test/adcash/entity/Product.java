/**
 * 
 */
package com.hasangi.test.adcash.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * @author hasan
 *
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Product {
	
	@Id
	private int product_id;
	private String name;
	private String description;
	private float price; 
	
	@ManyToMany(mappedBy = "products")
	Set<Category> categories;
	
	public Product() {}
	
	public Product(int product_id, String name, String description,float price) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.description = description;
		this.price=price;
	}

	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	

}
