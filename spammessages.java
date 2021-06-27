package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;


public class spammessages {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
       	WebDriver driver = new ChromeDriver();
       	driver. manage().window().maximize ();
        driver.get("https://opensource-demo.orangehrmlive.com/");
   	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
   	   // driver.findElement(By.id("txtPassword")).sendKeys("admin123");
   	 driver.findElement(By.id("btnLogin")).click();
	 List<WebElement> spans=driver.findElements(By.tagName("spam"));
	 System.out.println("Span message is"+spans.size());
	 for(WebElement w:spans)
	 {
		System.out.println(w.getText()); 
	 }
	 driver.close();
	 }
	

}
