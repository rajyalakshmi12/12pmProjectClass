package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGorder {
	@BeforeClass
	private void launchingchrome() {
    System.out.println("chrome");
}
	
  
	@AfterClass
    private void closingchrome() {
    	System.out.println("close");
    }
    
    @BeforeMethod
    private void starttime() {
    	System.out.println("start");
    }
    
    @AfterMethod
    private void endtime() {
    	System.out.println("end");
    }
    
    @Test
    private void tc1() {
    	System.out.println("text1");
    }
    
    @Test
    private void tc2() {
    	System.out.println("text2");
    }
    
    @Test
    private void tc3() {
    	System.out.println("text3");
    }
}
    
    
    
    
    

	


