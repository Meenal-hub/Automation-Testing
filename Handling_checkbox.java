package com.launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_checkbox {
	 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		
		String expMsg = "I am JavaScript Alert", actMsg=null;
		driver.get("file:///D:/Nedbank Training/SeleniumPrograms/New folder/alertExample.html");
		//driver.get("file:///C:/AdvancedSeleniumSoftwares/alertExample.html");
		driver.findElement(By.xpath(".//*[@id='btnAlert']")).click();
		
		Alert a = driver.switchTo().alert();
		
		actMsg = a.getText();
		
		if(actMsg.equals(expMsg))
		{
			System.out.println("Correct message \n " +actMsg);
		}
		else
			{ System.out.println("Wrong message \n " +actMsg);
			
			}
}		

}


		
		
		
		
		