package com.testng001;

import org.testng.annotations.Test;

public class DependOn {

	@Test 
	public void ant() {
		System.out.println("Sugar");
	}
	
	@Test (dependsOnMethods = "bat")
	public void cat() {
		System.out.println("Mouse");
	}
	
	@Test 
	public void bat() {
		System.out.println("Ball");
	}
	
	@Test (dependsOnMethods = "ant")
	public void dog() {
		System.out.println("Bone");
	}
}
