/**
 * 
 */
package com.hasangi.test.adcash.exception;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author hasan
 *
 */
@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {


	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> customHandleNotFound(Exception ex, WebRequest request) {
		return error(HttpStatus.NOT_FOUND, ex);

	}

	@ExceptionHandler({ RuntimeException.class })
	public ResponseEntity<CustomErrorResponse> handleRunTimeException(RuntimeException e) {
		return error(HttpStatus.INTERNAL_SERVER_ERROR, e);
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public void constraintViolationException(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}

	private ResponseEntity<CustomErrorResponse> error(HttpStatus status, Exception ex) {

		CustomErrorResponse errors = new CustomErrorResponse();
		errors.setTimestamp(LocalDateTime.now());
		errors.setError(ex.getMessage());
		errors.setStatus(status.value());

		return new ResponseEntity<>(errors, status);
	}

}
