package io.javabrains.springbootstarter.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.model.User;
import io.javabrains.springbootstarter.service.UserService;

@RestController
public class RestCon {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String Hello()
	{
		return "This is home page";
	}
	
	@GetMapping("/save-user")
	public String saveUser( @RequestParam String username, @RequestParam String firstname, @RequestParam String lastname,@RequestParam int age,@RequestParam String password)
	{
		User user = new User(username, firstname, lastname, age, password);
		userService.saveMyUser(user);
		return "user saved";
	}
}
