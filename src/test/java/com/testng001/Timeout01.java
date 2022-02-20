package com.testng001;

import org.testng.annotations.Test;

public class Timeout01 {

	@Test
	public void apple() {
		System.out.println("A");
	}

	@Test (timeOut = 300)
	public void bank() {
		System.out.println("B");
	}

	@Test (timeOut = 300)
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
