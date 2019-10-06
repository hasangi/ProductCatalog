/**
 * 
 */
package com.hasangi.test.adcash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hasangi.test.adcash.entity.Product;

/**
 * @author hasan
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
