package org.sample;

import org.junit.After;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitOrder  {
	
	@BeforeClass
	
	public static void launchingchrome() {
		System.out.println("chrome");
	}
	@AfterClass
	
	public static void closingbrowser() {
		System.out.println("close");
	}
	 @Before
	 public void startTime() {
		 System.out.println("start");
	 }
	 
	 @After
	 public void EndTime() {
		 System.out.println("end");
	 }
	 @Test
	 public void Tc1() {
		 System.out.println("Test1");
	 }
	 @Test
	 public void Tc2() {
		 System.out.println("Test2");
	 }
	 @Test
	 public void Tc3() {
		 System.out.println("Test3");
	 }
	 
	 
	
		
	
	
		
		
		
		
		
	

}
