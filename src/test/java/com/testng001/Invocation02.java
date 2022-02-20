package com.testng001;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Invocation02 {
	@Test (invocationCount = 3)
	public void apple() {
		System.out.println("A");
	}

	@Test
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

	@Test (invocationCount = 4)
	public void egg() {
		System.out.println("E");
	}
}
