package com.testng001;

import org.testng.annotations.Test;

public class Grouping {

	@Test 
	public void ant() {
		System.out.println("Sugar");
	}
	
	@Test (groups = "pets")
	public void cat() {
		System.out.println("Mouse");
	}
	
	@Test 
	public void bat() {
		System.out.println("Ball");
	}
	
	@Test (groups = "pets")
	public void dog() {
		System.out.println("Bone");
	}
}
