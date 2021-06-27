package com.launch;
//rsjoshi.241087@gmail.com
import org.testng.annotations.Test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.Timeline;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
  @Test(dataProvider = "getData")
     public void f( String n, String s) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.id("txtUsername")).sendKeys(n);
	  driver.findElement(By.name("txtPassword")).sendKeys(s);
	  driver.findElement(By.id("btnLogin")).click();
	  
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  

  }

  @DataProvider
   
     public Object [] [] getData()
 	{
 		Object [] [] data = new Object[4] [2];
 		data[0][0] = "Admin";
 		data[0][1]="admin123";
 		
 		data[1][0] ="Admin";
 		data[1][1] ="admin123";
 		
 		data[2][0]="Admin";
 		data[2][1]="admin123";
 		
 		data[3][0]="Admin";
 		data[3][1]="admin123";
 		
 		return data;
 	

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard%22");
  }

 

  @AfterTest
  public void afterTest1() {
	  
	  
	  driver.close();
  }
  

}
