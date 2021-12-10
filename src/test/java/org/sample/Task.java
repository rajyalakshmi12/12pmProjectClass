package org.sample;

import java.io.IOException;
import java.util.Date;

import org.bouncycastle.asn1.dvcs.Data;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task extends Baseclass {
 
	@BeforeClass
	
	public static void launchingBrowser() {
		launchchrome();
		loadUrl("https://www.facebook.com/");
		winmax();
	}
@AfterClass  
public static void closingBrowser() {
	closechrome();
}
@Before
public void starttime() {
	Date d= new Date();
	System.out.println(d);
	
}
@After
public void endtime() {
	Date d= new Date();
	System.out.println(d);
	
}
@Test(groups ="smoke")
private void tc3() throws IOException {
	PojoClass f =new PojoClass();
	fill(f.getTxtuser(),getData(1,0));
	fill(f.getTxtpass(),getData(2, 0));
	btnclick(f.getBtnlogin());
}
@Test(groups ="Regression")
private void tc2() throws IOException {
	PojoClass f =new PojoClass();
	fill(f.getTxtuser(),getData(3,0));
	fill(f.getTxtpass(),getData(3, 1));
	btnclick(f.getBtnlogin());
}
@Test(groups ="sanity")
private void tc1() throws IOException {
	PojoClass f =new PojoClass();
	fill(f.getTxtuser(),getData(3,1));
	fill(f.getTxtpass(),getData(2, 1));
	btnclick(f.getBtnlogin());
}
@Test(groups ="smoke")
private void tc4() throws IOException {
	PojoClass f =new PojoClass();
	fill(f.getTxtuser(),getData(4,1));
	fill(f.getTxtpass(),getData(2, 0));
	btnclick(f.getBtnlogin());
}
@Test(groups ="smoke")
private void tc5() throws IOException {
	PojoClass f =new PojoClass();
	fill(f.getTxtuser(),getData(3,3));
	fill(f.getTxtpass(),getData(2, 3));
	btnclick(f.getBtnlogin());
}




}

	
	
	


