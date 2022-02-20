package com.testng001;

import org.testng.annotations.Test;

public class Grouping01 {
	@Test (groups = "mine")
	public void apple() {
		System.out.println("A");
	}

	@Test
	public void bank() {
		System.out.println("B");
	}

	@Test (groups = "mine")
	public void car() {
		System.out.println("C");
	}

	@Test 
	public void dog() {
		System.out.println("D");
	}

	@Test 
	public void egg() {
		System.out.println("E");
	}
}
