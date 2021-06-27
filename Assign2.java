package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Assign2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");

	  	 WebDriver driver=new ChromeDriver();
		 	
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("item-1")).click();
		driver.findElement(By.id("alertButton")).click();
		String expMsg = "You clicked a button", actMsg=null;
		driver.findElement(By.xpath(".//*[@id='btnAlert']")).click();
		Alert a= driver.switchTo().alert();
		
			actMsg = a.getText();
				
				if(actMsg.equals(expMsg))
				{
					System.out.println("Correct message \n " +actMsg);
				}
				else
				{ System.out.println("Wrong message \n " +actMsg);
				
				}
				
		driver.findElement(By.id("timerAlertButton")).click();
		String expMsg1 = "This alert appeared after 5 seconds", actMsg1=null;

}
}