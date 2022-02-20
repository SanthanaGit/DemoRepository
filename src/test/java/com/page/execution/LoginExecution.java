package com.page.execution;

import com.baseclass.BaseClass;
import com.locators.LoginPage;

public class LoginExecution extends BaseClass {

	public static void login_username() {
		 BaseClass.typedata(BaseClass.findElementById(LoginPage.username), "santhana1");
	}
	
	public static void login_password() {
		 BaseClass.typedata(BaseClass.findElementById(LoginPage.password), "1234567890");
	}
}
