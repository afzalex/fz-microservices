package com.fz.ms.musicservice.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationRestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(IOException.class)
	public ResponseEntity<Map<String, String>> ioExceptionHandler() {
		return ResponseEntity.badRequest().body(Collections.singletonMap("error", "Unable to parse data"));
	}
}
