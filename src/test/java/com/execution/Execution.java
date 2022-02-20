package com.execution;

import com.baseclass.BaseClass;
import com.page.execution.LoginExecution;


public class Execution extends LoginExecution {

	public static void main(String[] args) {
		BaseClass.browserlaunch();
		BaseClass.url("https://adactinhotelapp.com/index.php");
		login_username();
		login_password();
	}
	
}
