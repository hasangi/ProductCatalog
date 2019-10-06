/**
 * 
 */
package com.hasangi.test.adcash.exception;

/**
 * @author hasan
 *
 */

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(int id) {
        super("Resource id not found : " + id);
    }
	
	public ResourceNotFoundException(String meg) {
        super(meg);
    }
}
