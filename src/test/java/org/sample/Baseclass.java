package org.sample;

import java.awt.Desktop.Action;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.binary.CharSequenceUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	// 1 launch chrome
	public static void launchchrome() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	// 2 load url of the page 
	public static void loadUrl(String Url) {
		driver.get(Url);
	}
	// 3 maximize the window
	public static void winmax() {
		driver.manage().window().maximize();
	}
	
    // 4 print Title
	public static void printtitle() {
		System.out.println(driver.getTitle());
	}
     //	5 print current url
	
	public static void printcurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	// 6 send keys
	 
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	// click method
	 
	public static void btnclick(WebElement ele) {
		ele.click();
	}
	// 8 close the tab
     public static void closechrome() {
	driver.close();
	 }
     //9 read the excel sheet to input value and data
    public static String getData(int rowNumber,int cellNumber) throws IOException {
    File f=new File("D:\\RajyalakshmiTesting\\12PMFrameworkClass\\target\\raji.xlsx");
    
    FileInputStream fin=new FileInputStream(f);
    
    Workbook w=new XSSFWorkbook(fin);
    
    Sheet s =w.getSheet("login");
    
    Row row = s.getRow(rowNumber) ;
    org.apache.poi.ss.usermodel.Cell cell = row.getCell(cellNumber);
    int cellType = cell.getCellType();
    
    String value ="";
    if (cellType == 1) {
    	value = cell.getStringCellValue();
    }else if (cellType==0) {
    	if
    	(DateUtil.isCellInternalDateFormatted(cell)) {
    		Date d = cell.getDateCellValue();
    		SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
    		value = sim.format(d);
    	}else {
    		double d = cell.getNumericCellValue();
    		long l=(long)d;
    		 value = String.valueOf(1);
    	}
    }
   return value; 	
		
	}
	// close the entire chrome	
    public static void quitechrome() {
    	driver.quit();
	}
    
  public static  Actions a1;
  // 11 move to element in actions 
  public static void movetoElement(WebElement ele) {
	  a1=new Actions(driver);
	  a1.moveToElement (ele).perform();
	
}
  // 12 Drag And Drop in Actions
	public static void dragDrop(WebElement src,WebElement des) {
	 a1=new Actions(driver);
	 a1.dragAndDrop(src, des).perform();
	}
	// 13 key down actions
	public static void keyKickDown(WebElement eleTarget,CharSequence key) {
		a1 = new Actions(driver);
		a1.keyUp(eleTarget, key).perform();
	}
	// 14 key up Actions
	public static void keyKickup(WebElement eleTarget,CharSequence key) {
		a1=new Actions(driver);
		a1.keyDown(eleTarget, key).perform();
		
 
			
		}
	private void jebin() {
		System.out.println("jebin moses");

	}
			
		
		
		
	
	
		
	}
	

	


