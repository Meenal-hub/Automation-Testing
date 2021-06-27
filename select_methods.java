package com.launch;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_methods {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
	
		//specify the LambdaTest URL
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login%22);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/%22");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();
		driver.findElement(By.linkText("Odis")).click();
			
		driver.findElement(By.id("btnSave")).click();
			
			
			
			
		WebElement opti = driver.findElement(By.id("personal_cmbNation"));
		Select nations = new Select(opti);
			
		System.out.println("default option is " + nations.getFirstSelectedOption().getText());
			
			
			
			List<WebElement> countries = nations.getOptions();
			
			System.out.println("Number of countires " +countries.size());
			
			

//			nations.selectByVisibleText("Indian");
			
//			nations.selectByValue("82");
			
			nations.selectByIndex(82);
			
			System.out.println("Choosen value is : " + nations.getFirstSelectedOption().getText());
			
		
			//driver.close();

}
}
