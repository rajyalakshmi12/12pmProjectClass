package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends Baseclass {
	//1.default constructor
		public PojoClass() {
			PageFactory.initElements(driver, this);
		}
		//2.annotation and private WebElement
		@FindBy(id="email")
		private WebElement txtuser;
		@FindBy(id="pass")
		private WebElement txtpass;
		@FindBy(xpath="//button[@name='login']")
		private WebElement btnlogin;
		
		// getters to access WebElement
		
		public WebElement getTxtuser() {
			return txtuser;
		}
		public WebElement getTxtpass() {
			return txtpass;
		}
		public WebElement getBtnlogin() {
			return btnlogin;
		}
	}

		
		



