package com.sanskaricode;

public class LoginService {

	public boolean isUserValid(String name, String password) {
		if (name.equals("vijay") && password.equals("password")) {
			return true;
		}

		return false;
	}
}
