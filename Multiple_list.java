package com.launch;



//import java.util.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//import com.sun.org.apache.bcel.internal.generic.Select;
public class Multiple_list {
	 @SuppressWarnings("unused")
	public static void main(String[] args) {
     	
	        
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
    
    	 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/Meenal/Desktop/car.html");
	
	WebElement lb = driver.findElement(By.name("cars"));
	
	Select cars= new Select(lb);
	
	if(cars.isMultiple())
	{
		cars.selectByIndex(0);
		cars.selectByIndex(2);
		cars.selectByVisibleText("Audi");
	}
	
	java.util.List<WebElement> selCars = cars.getAllSelectedOptions();
		
	System.out.println("Selected cars ");
	
	for(WebElement we : selCars)
	{
		System.out.println("Select Cars");

for(WebElement we1 : selCars)
	{
		System.out.println(we1.getText());
	}
		
		
	driver.close();
	}
}

}
