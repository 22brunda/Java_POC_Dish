package com.qwinix.productcatalog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ValidationException extends RuntimeException {
	public ValidationException(String msg) {
		super(msg);
	}
}
