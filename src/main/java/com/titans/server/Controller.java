package com.titans.server;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5173/")
public class Controller {

    @GetMapping("/hi")
	public String hello() {
		return "Hello World!";
	}
    
}
