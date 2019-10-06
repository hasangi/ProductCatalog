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
 * The class <code>CategoryTest</code> contains tests for the class <code>{@link Category}</code>.
 *
 * @generatedBy CodePro at 10/5/19 4:32 PM
 * @author hasan
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryTest {
	/**
	 * Run the Category() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testCategory_1()
		throws Exception {

		Category result = new Category();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getProducts());
		assertEquals(null, result.getDescription());
		assertEquals(0, result.getCategory_id());
	}

	/**
	 * Run the Category(int,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testCategory_2()
		throws Exception {
		int category_id = 1;
		String name = "";
		String description = "";

		Category result = new Category(category_id, name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getProducts());
		assertEquals("", result.getDescription());
		assertEquals(1, result.getCategory_id());
	}

	/**
	 * Run the int getCategory_id() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testGetCategory_id_1()
		throws Exception {
		Category fixture = new Category(1, "", "");
		fixture.setProducts(new HashSet<>());

		int result = fixture.getCategory_id();

		// add additional test code here
		assertEquals(1, result);
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
		Category fixture = new Category(1, "", "");
		fixture.setProducts(new HashSet<>());

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
		Category fixture = new Category(1, "", "");
		fixture.setProducts(new HashSet<>());

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Set<Product> getProducts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testGetProducts_1()
		throws Exception {
		Category fixture = new Category(1, "", "");
		fixture.setProducts(new HashSet<>());

		Set<Product> result = fixture.getProducts();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setCategory_id(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testSetCategory_id_1()
		throws Exception {
		Category fixture = new Category(1, "", "");
		fixture.setProducts(new HashSet<>());
		int category_id = 1;

		fixture.setCategory_id(category_id);

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
		Category fixture = new Category(1, "", "");
		fixture.setProducts(new HashSet<>());
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
		Category fixture = new Category(1, "", "");
		fixture.setProducts(new HashSet<>());
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setProducts(Set<Product>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:32 PM
	 */
	@Test
	public void testSetProducts_1()
		throws Exception {
		Category fixture = new Category(1, "", "");
		fixture.setProducts(new HashSet<>());
		Set<Product> products = new HashSet<>();

		fixture.setProducts(products);

		// add additional test code here
	}


}