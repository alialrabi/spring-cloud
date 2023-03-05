package com.cloud.product.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
			
	@GetMapping("/products")
	public String getUsers() {
		return "products list";	
	}

}
