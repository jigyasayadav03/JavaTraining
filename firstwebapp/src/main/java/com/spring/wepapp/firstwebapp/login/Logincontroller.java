package com.spring.wepapp.firstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class Logincontroller {
	@RequestMapping("login")
	public String gotoLoginPage() {
		return "login";
	}
	
}
