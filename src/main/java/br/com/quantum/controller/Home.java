package br.com.quantum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	
@RestController
@RequestMapping("/")
public class Home {
	
	@RequestMapping(method = RequestMethod.GET, path = "/test2")
	public ResponseEntity<String> test2() throws Exception {
		return  ResponseEntity.ok("ok");		
	}
	
}