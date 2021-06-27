package com.launch;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;
//import java.util.List;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

public class logoutbyfluient_wait {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver. manage().window().maximize ();
		driver.get ("http://127.0.0.1:8e80/orangehrm/synfony /web/index.php/auth/login ") ;
		driver.findElement (By.id("txtUsername" )).sendKeys("admin");
		driver.findElement (By. id("txtPassword")).sendKeys ("seedadmin ");
		driver.findElement (By. id("btnLogin")).click();
        driver.findElement(By.partialLinkText("Welcome")).click();
		
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		
		fw.withTimeout(20,TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
		.pollingEvery(1,TimeUnit.NANOSECONDS)
		.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
		
	}
	

}
