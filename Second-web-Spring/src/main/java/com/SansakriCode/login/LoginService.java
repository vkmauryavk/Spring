package com.SansakriCode.login;

public class LoginService {

	String name;
	String password;

	public boolean isUserValid(String name, String password) {
		if (name.equals("vijay") && password.equals("password")) {
			return true;
		}
		return false;

	}
}
