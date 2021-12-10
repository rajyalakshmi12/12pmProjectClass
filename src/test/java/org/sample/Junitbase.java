package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitbase extends Baseclass{
	@BeforeClass
	public static void launchingbrowser() {
		launchchrome();
		loadUrl("https://www.facebook.com/");
		winmax();
	}
	@AfterClass
	public static void closingBrowser() {
		closechrome();
	}
  //  @Before
   public void startTime() {
    	Date d=new Date();
    	System.out.println(d);
   }
   @After
    public void endtime() {
   	System.out.println(new Date());
    }
   // USER NAME
//   @Test
  // public void tc1() {
	//   FbLoginpojo f=new FbLoginpojo();
   }
    	
    	
    	
 //   }
		
		
	
	
	
	

