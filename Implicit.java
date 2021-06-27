package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
//import java.util.List;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Implicit {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       	WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
			
			//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			//driver.findElement(By.id("btnLogin")).click();
			
			//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			
			
			//driver.findElement(By.partialLinkText("Welcome")).click();
			
			
			
			driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
			driver.get("https://demoqa.com/browser-windows");
			driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
			driver.switchTo().alert().accept();
		}

	}


