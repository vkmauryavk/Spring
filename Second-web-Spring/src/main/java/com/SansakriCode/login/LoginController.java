package com.SansakriCode.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private LoginService service = new LoginService();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String HandleFormData(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {
		if (service.isUserValid(name, password)) {
			modelMap.put("name", name);
			modelMap.put("password", password);
			return "welcome";
		} else {
			modelMap.put("errormsg", "Invalid Creditials");
			return "login";

		}
	}

}