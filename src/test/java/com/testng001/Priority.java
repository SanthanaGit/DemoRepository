package com.testng001;

import org.testng.annotations.Test;

public class Priority {

	@Test (priority = 2)
	public void ant() {
		System.out.println("Sugar");
	}
	
	@Test (priority = 3)
	public void cat() {
		System.out.println("Mouse");
	}
	
	@Test 
	public void bat() {
		System.out.println("Ball");
	}
	
	@Test 
	public void dog() {
		System.out.println("Bone");
	}
}
