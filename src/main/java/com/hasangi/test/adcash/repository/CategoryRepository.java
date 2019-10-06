/**
 * 
 */
package com.hasangi.test.adcash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hasangi.test.adcash.entity.Category;

/**
 * @author hasan
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
