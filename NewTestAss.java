package com.launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//import org.apache.commons.io.FileUtils;





public class NewTestAss {
  WebDriver driver;
		
	  @Test(dataProvider = "getData")
	     public void f( String n, String s) throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.id("user")).sendKeys(n);
		  driver.findElement(By.id("pass")).sendKeys(s);
		  driver.findElement(By.name("login_user")).click();
		  
		  //driver.findElement(By.id("welcome")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  

	  }

	  @DataProvider
	   
	     public Object [] [] getData()
	 	{
	 		Object [] [] data = new Object[4] [2];
	 		data[0][0] = "Meenal_Kore";
	 		data[0][1]="Meenalkore10";
	 		
	 		data[1][0] ="Meenal_Kore";
	 		data[1][1] ="Meenalkore10";
	 		
	 		data[2][0]="Meenal_Kore";
	 		data[2][1]="Meenalkore10";
	 		
	 		data[3][0]="Meenal_Kore";
	 		data[3][1]="Meenalkore10";
	 		
	 		return data;
	 	

	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  //driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.get("https://lms-nachiketjoshi.in/login_std.php");
	  }

	 

	  @AfterTest
	  public void afterTest1() {
		  
		  
		  driver.close();
	  }
	  

}

