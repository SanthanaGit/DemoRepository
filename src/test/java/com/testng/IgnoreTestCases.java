package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestCases {
	@Ignore
	@Test (priority = -2)
	public void test1() {
		System.out.println("Test1");
	}

	@Test (enabled = false)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test (priority = 1)
	public void test3() {
		System.out.println("Test3");
	}
}
