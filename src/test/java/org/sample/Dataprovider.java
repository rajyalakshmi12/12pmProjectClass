package org.sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider extends Baseclass {
	@Test(dataProvider="fblogin")
	private void tc2(String s1,String s2) throws InterruptedException {
		launchchrome();
		loadUrl("https://www.facebook.com/");
		PojoClass f=new PojoClass();
		fill(f.getTxtuser(),s1);
		fill(f.getTxtuser(),s2);
		btnclick(f.getBtnlogin());
		Thread.sleep(2000);
	}
	@DataProvider(name="fblogin")
	public Object [][] gettingdata() {
		return new Object[][] {
			{"sql","sql@123"},
			{"java","java@123"},
			{"python","python@123"},
			{"selenium","selenium@123"}






		};

	}}