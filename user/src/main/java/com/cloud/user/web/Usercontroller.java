
package com.cloud.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
class UserController {
	
	@GetMapping("/list")
	public String getUsers() {
		return "users list";
	}

}
