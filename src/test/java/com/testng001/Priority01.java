package com.testng001;

import org.testng.annotations.Test;

public class Priority01 {
	@Test (priority = 2)
	public void apple() {
		System.out.println("A");
	}

	@Test
	public void bank() {
		System.out.println("B");
	}

	@Test (priority = 4)
	public void car() {
		System.out.println("C");
	}

	@Test
	public void dog() {
		System.out.println("D");
	}

	@Test (priority = 3)
	public void egg() {
		System.out.println("E");
	}

}
