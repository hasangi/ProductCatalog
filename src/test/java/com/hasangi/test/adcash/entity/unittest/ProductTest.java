package com.hasangi.test.adcash.entity.unittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hasangi.test.adcash.entity.Category;
import com.hasangi.test.adcash.entity.Product;

/**
 * The class <code>ProductTest</code> contains tests for the class <code>{@link Product}</code>.
 *
 * @generatedBy CodePro at 10/5/19 4:32 PM
 * @author hasan
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
	/**
	 * Run the Product() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testProduct_1()
		throws Exception {

		Product result = new Product();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getCategories());
		assertEquals(0, result.getProduct_id());
		assertEquals(0.0f, result.getPrice(), 1.0f);
	}

	/**
	 * Run the Product(int,String,String,float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testProduct_2()
		throws Exception {
		int product_id = 1;
		String name = "";
		String description = "";
		float price = 1.0f;

		Product result = new Product(product_id, name, description, price);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals("", result.getDescription());
		assertEquals(null, result.getCategories());
		assertEquals(1, result.getProduct_id());
		assertEquals(1.0f, result.getPrice(), 1.0f);
	}

	/**
	 * Run the Set<Category> getCategories() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testGetCategories_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());

		Set<Category> result = fixture.getCategories();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the float getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());

		float result = fixture.getPrice();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the int getProduct_id() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testGetProduct_id_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());

		int result = fixture.getProduct_id();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setCategories(Set<Category>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testSetCategories_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());
		Set<Category> categories = new HashSet<>();

		fixture.setCategories(categories);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());
		float price = 1.0f;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setProduct_id(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testSetProduct_id_1()
		throws Exception {
		Product fixture = new Product(1, "", "", 1.0f);
		fixture.setCategories(new HashSet<>());
		int product_id = 1;

		fixture.setProduct_id(product_id);

		// add additional test code here
	}



}