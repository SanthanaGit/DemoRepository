package com.testng001;

import org.testng.annotations.Test;

public class Invocation {
	
	@Test (invocationCount = 2)
	public void ant() {
		System.out.println("Sugar");
	}
	
	@Test (invocationCount = 2)
	public void cat() {
		System.out.println("Mouse");
	}
	
	@Test (invocationCount = 3)
	public void bat() {
		System.out.println("Ball");
	}
	
	@Test (invocationCount = 3)
	public void dog() {
		System.out.println("Bone");
	}
}
