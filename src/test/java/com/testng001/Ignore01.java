package com.testng001;

import org.testng.annotations.Test;

public class Ignore01 {
	
	@Test
	public void apple() {
		System.out.println("A");
	}

	@Test (enabled = false)
	public void bank() {
		System.out.println("B");
	}

	@Test
	public void car() {
		System.out.println("C");
	}

	@Test (enabled = false)
	public void dog() {
		System.out.println("D");
	}

	@Test
	public void egg() {
		System.out.println("E");
	}

}
