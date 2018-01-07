package br.com.quantum.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
	
@RestController
@RequestMapping("/")
public class Home {

	@RequestMapping(method = RequestMethod.GET, path = "/test")
	public ResponseEntity<String> test() throws Exception {
		return  ResponseEntity.ok("ok");		
	}
	
}