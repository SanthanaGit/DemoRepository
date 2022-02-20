package com.testng001;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority02 {
	@Test (priority = 2)
	public void apple() {
		System.out.println("A");
	}

	@Test
	@Ignore
	public void bank() {
		System.out.println("B");
	}

	@Test
	@Ignore
	public void car() {
		System.out.println("C");
	}

	@Test (priority = 3)
	public void dog() {
		System.out.println("D");
	}

	@Test (priority = 1)
	public void egg() {
		System.out.println("E");
	}

}
