package com.testng001;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore02 {
	@Test
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

	@Test
	public void dog() {
		System.out.println("D");
	}

	@Test
	public void egg() {
		System.out.println("E");
	}

}
