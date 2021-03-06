package com.Oath2Sso.demo;



import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class Oath2SsoApplication {
	
	@RequestMapping("/")
	public String login(Principal principal) {
		return "Hello "+principal.getName()+" you used Oauth2 to access this page";
	}

	public static void main(String[] args) {
		SpringApplication.run(Oath2SsoApplication.class, args);
	}

}
