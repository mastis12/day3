package com.dropdown;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

WebDriver driver;
	
	public void setup()
	{
	System.setProperty("WebDriver.chrome.driver","/Users/shaik/Documents/Selenium jars/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
		
	}
	
	
	public void Dropvalues()

	{
	
		WebElement day_dropdown =driver.findElement(By.id("day"));
		Select dayd= new Select(day_dropdown);
		dayd.deselectByValue("1");		
		
		
	}
	

		public static void main(String[] args)
		
		
		{
			dropdowns d= new dropdowns();
			d.setup();
			d.Dropvalues();
			
			
		
	}
}
