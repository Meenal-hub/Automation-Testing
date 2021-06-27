package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
        public static void main(String[] args) {
        	
        
        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
        	 WebDriver driver=new ChromeDriver();
        	 
        	 driver.get("https://opensource-demo.orangehrmlive.com/");
        	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        	 driver.findElement(By.id("btnLogin")).click();
        	 
        	 driver.findElement(By.className("")).click();
        	 
        	 System.out.println(driver.getCurrentUrl());
        	 System.out.println(driver.getPageSource());
        	 System.out.println(driver.getTitle());
        }//https://www.tutorialspoint.com/question/index.php
        
        
        
}
