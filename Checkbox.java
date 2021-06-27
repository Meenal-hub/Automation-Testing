package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Checkbox {

		public static void main(String[] args)
		{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/");
                
				
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");

				driver.findElement (By.id("lead meme")).click();
				driver.findElement(By.id("txtUsername")).sendKeys("admin");
	            driver.findElement(By.linkText("PIM")).click();
				driver.findElement(By.linkText("Add Employee")).click();
				
				// createWebElement variable and check 
				
				WebElement wb = driver.findElement(By.id("chkLogin"));
				
				
				if(wb.isDisplayed() && wb.isEnabled() && wb.isSelected() == false)
				{
					wb.click();
				}
				
				
			driver.close();

		}

}
