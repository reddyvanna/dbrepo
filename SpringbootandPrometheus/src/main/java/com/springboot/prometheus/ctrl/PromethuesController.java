package com.springboot.prometheus.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PromethuesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PromethuesController.class);

	@GetMapping(value = "/welcome")
	public ResponseEntity<String> grettings() {
		LOGGER.info("Returning the welcome response.");
		return new ResponseEntity<>("Hello world", HttpStatus.OK);
	}

}
