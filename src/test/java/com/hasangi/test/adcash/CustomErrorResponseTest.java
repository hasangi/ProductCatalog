package com.hasangi.test.adcash;

import java.time.LocalDateTime;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hasangi.test.adcash.exception.CustomErrorResponse;

import static org.junit.Assert.*;

/**
 * The class <code>CustomErrorResponseTest</code> contains tests for the class <code>{@link CustomErrorResponse}</code>.
 *
 * @generatedBy CodePro at 10/5/19 4:59 PM
 * @author hasan
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomErrorResponseTest {
	/**
	 * Run the String getError() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:59 PM
	 */
	@Test
	public void testGetError_1()
		throws Exception {
		CustomErrorResponse fixture = new CustomErrorResponse();
		fixture.setError("");
		fixture.setStatus(1);
		fixture.setTimestamp(LocalDateTime.MAX);

		String result = fixture.getError();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:59 PM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		CustomErrorResponse fixture = new CustomErrorResponse();
		fixture.setError("");
		fixture.setStatus(1);
		fixture.setTimestamp(LocalDateTime.MAX);

		int result = fixture.getStatus();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the LocalDateTime getTimestamp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:59 PM
	 */
	@Test
	public void testGetTimestamp_1()
		throws Exception {
		CustomErrorResponse fixture = new CustomErrorResponse();
		fixture.setError("");
		fixture.setStatus(1);
		fixture.setTimestamp(LocalDateTime.MAX);

		LocalDateTime result = fixture.getTimestamp();

		// add additional test code here
		assertNotNull(result);
		assertEquals("+999999999-12-31T23:59:59.999999999", result.toString());
		assertEquals(31, result.getDayOfMonth());
		assertEquals(365, result.getDayOfYear());
		assertEquals(999999999, result.getYear());
		assertEquals(23, result.getHour());
		assertEquals(59, result.getMinute());
		assertEquals(12, result.getMonthValue());
		assertEquals(999999999, result.getNano());
		assertEquals(59, result.getSecond());
	}

	/**
	 * Run the void setError(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:59 PM
	 */
	@Test
	public void testSetError_1()
		throws Exception {
		CustomErrorResponse fixture = new CustomErrorResponse();
		fixture.setError("");
		fixture.setStatus(1);
		fixture.setTimestamp(LocalDateTime.MAX);
		String error = "";

		fixture.setError(error);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:59 PM
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		CustomErrorResponse fixture = new CustomErrorResponse();
		fixture.setError("");
		fixture.setStatus(1);
		fixture.setTimestamp(LocalDateTime.MAX);
		int status = 1;

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setTimestamp(LocalDateTime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/5/19 4:59 PM
	 */
	@Test
	public void testSetTimestamp_1()
		throws Exception {
		CustomErrorResponse fixture = new CustomErrorResponse();
		fixture.setError("");
		fixture.setStatus(1);
		fixture.setTimestamp(LocalDateTime.MAX);
		LocalDateTime timestamp = LocalDateTime.MAX;

		fixture.setTimestamp(timestamp);

		// add additional test code here
	}

}