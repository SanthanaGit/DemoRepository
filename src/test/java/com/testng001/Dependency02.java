package com.testng001;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency02 {
	@Test
	public void apple() {
		System.out.println("A");
	}

	@Test (enabled = false)
	public void bank() {
		System.out.println("B");
	}

	@Test
	@Ignore
	public void car() {
		System.out.println("C");
	}

	@Test (dependsOnMethods = "apple")
	public void dog() {
		System.out.println("D");
	}

	@Test (dependsOnMethods = "bank")
	public void egg() {
		System.out.println("E");
	}
}
