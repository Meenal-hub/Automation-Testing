package com.launch;

	import java.util.List;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	//import org.openqa.selenium.firefox.FirefoxDriver;
	public class Assignment {

		public static void main(String[] args) {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Meenal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        
			WebDriver driver = new ChromeDriver();
		 	
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).click();
		    driver.findElement(By.linkText("PIM")).click();
		    driver.findElement(By.id("menu_pim_addEmployee")).click();
		    //String expMsg = "I am JavaScript Alert", actMsg=null;
			//driver.get("file:///D:/Automated%20Testing%20Training/Day%202/sam.html");
			//driver.get("file:///C:/AdvancedSeleniumSoftwares/alertExample.html");
			//driver.findElement(By.xpath(".//*[@id='btnAlert']")).click();
			
			//Alert a = driver.switchTo().alert();
			
			//actMsg = a.getText();
			
			//if(actMsg.equals(expMsg))
			//{
			//	System.out.println("Correct message \n " +actMsg);
			//}
			//else
			//	{ System.out.println("Wrong message \n " +actMsg);

		//}
		    //WebElement wb = driver.findElement(By.id("chkLogin"));
			
			
			//if(wb.isDisplayed() && wb.isEnabled() && wb.isSelected() == false)
			//{
				//wb.click();
			//}

			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();
		
			driver.findElement(By.linkText("Lisa")).click();
		
			List<WebElement> genderLabel = driver.findElements(By.xpath(".//ul[@class='radio_list']/li/label"));
		
			for(WebElement web : genderLabel)
			{
				System.out.println(web.getText());
			}
			System.out.println("Status befor clciking on edit buttons : ");
			List<WebElement> gender = driver.findElements(By.xpath(".//ul[@class='radio_list']/li/input")); 
			
			for(WebElement web : gender)
			{
				System.out.println(web.isEnabled());
			}
			
				
			driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
			
			System.out.println("Status after clicking on save button ");
			
			for(WebElement web :gender)
			{
				System.out.println(web.isEnabled());
			}
			
			
			WebElement web = driver.findElement(By.id("personal_optGender_2"));
			web.click();	
			

			

	}
	

}
