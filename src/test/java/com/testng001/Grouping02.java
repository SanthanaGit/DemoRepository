package com.testng001;

import org.testng.annotations.Test;

public class Grouping02 {

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

		@Test (groups = "home")
		public void dog() {
			System.out.println("D");
		}

		@Test (groups = "home")
		public void egg() {
			System.out.println("E");
		}
	} 
	
