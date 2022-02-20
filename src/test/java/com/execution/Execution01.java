package com.execution;

import com.baseclass.BaseClass01;

public class Execution01 extends BaseClass01{
	
	public static void main(String[] args) {
		
		browserlaunch();
		url("https://www.facebook.com/");
		keys("//input[@type='text']", "rajesh");
		
		
		
	}

}
