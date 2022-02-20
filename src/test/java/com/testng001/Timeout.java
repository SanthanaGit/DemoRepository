package com.testng001;

import org.testng.annotations.Test;

public class Timeout {
	
	@Test (timeOut = 1000)
	public void ant() {
		System.out.println("Sugar");
	}
	
	@Test (timeOut = 1000)
	public void bat() {
		System.out.println("Ball");
	}

	@Test 
	public void cat() {
		System.out.println("Mouse");
	}
	
	@Test 
	public void dog() {
		System.out.println("Bone");
	}
}
