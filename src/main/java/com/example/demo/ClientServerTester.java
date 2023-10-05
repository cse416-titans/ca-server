package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ClientServerTester {

	@GetMapping("/getdata")
	public String foo() {
		return "Response!";
	}

	@PostMapping("/saymyname")
	public Answering answering(@RequestParam(value = "name", defaultValue = "noname") String name) {
		return new Answering("Your name is " + String.format(name));
	}
}
