package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ChromeDriver driver1 = new ChromeDriver();
//		driver.get("www.anywhere.stage.virginmedia.com");
		System.setProperty("webdriver.gecko.driver","/Users/shaik/Documents/Selenium jars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.anywhere.stage.virginmedia.com");
			driver.findElementByLinkText("Sign in").click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.findElement(By.id("username")).sendKeys("vmtsone@gmail.com");
					
			
		    driver.findElement(By.id("password")).sendKeys("tivo12345");
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath(".//*[@id='login']/div[3]/button")).click();
			
	
	
	}

}
	