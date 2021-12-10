package org.sample;

import org.testng.annotations.Test;

public class Testingconcept {
	@Test(groups="smoke")
	private void tc33() {
		System.out.println("test33");
	}
		
		@Test(groups="Regression")
		private void tc11() {
			System.out.println("test11");
		}
			@Test(groups="sanity")
		private void tc22() {
				System.out.println("test22");
			}
		
	}


