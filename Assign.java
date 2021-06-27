package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Assign {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");

   	 WebDriver driver=new ChromeDriver();
	 	
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement opti = driver.findElement(By.xpath("//select[@id='first']"));
		Select Products = new Select(opti);
		
		System.out.println("default option is " + Products.getFirstSelectedOption().getText());
		
		List<WebElement> Brand = Products.getOptions();
		
		System.out.println("Number of countires " +Brand.size());

		Products.selectByVisibleText("Google");
		
		//Products.selectByValue("82");
		
	//	nations.selectByIndex(82);
		
		System.out.println("Choosen value is : " + Products.getFirstSelectedOption().getText());
		//----------------------------------------------------------------------------------------------
		WebElement opt = driver.findElement(By.id("animals"));
		Select Animals = new Select(opt);
		
		System.out.println("default option is " + Animals.getFirstSelectedOption().getText());
		
		List<WebElement> Braand = Animals.getOptions();
		System.out.println("Number of countires " +Braand.size());
		Animals.selectByVisibleText("Avatar");
		System.out.println("Choosen value is : " + Animals.getFirstSelectedOption().getText());
		
	//---------------------------------------------------------------------------------------------------------------------------
		
		
		WebElement lb = driver.findElement(By.xpath("//select[@id='second']"));
		
		Select Food= new Select(lb);
		
		if(Food.isMultiple())
		{
			Food.selectByIndex(0);
			Food.selectByIndex(2);
			Food.selectByVisibleText("Bonda");
		}
		
		List<WebElement> selFood = Food.getAllSelectedOptions();
			
		System.out.println("Selected Food ");
		
		for(WebElement we : selFood)
		{
			System.out.println("Select Food");
			System.out.println(we.getText());
		}
			
			
		//driver.close();
		}
	
	}

