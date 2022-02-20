package com.testng001;

import org.testng.annotations.Test;

public class Ignore {

	@Test 
	@org.testng.annotations.Ignore
	public void ant() {
		System.out.println("Sugar");
	}
	
	@Test
	
	public void cat() {
		System.out.println("Mouse");
	}
	
	@Test 
	@org.testng.annotations.Ignore
	public void bat() {
		System.out.println("Ball");
	}

}
