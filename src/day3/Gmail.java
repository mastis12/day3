package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","/Users/shaik/Documents/Selenium jars/geckodriver");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://anywhere.stage.virginmedia.com/");
		 WebDriverWait wait =new WebDriverWait(driver, 5);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("On Demand")));
		 System.out.println("yestersttssttsstts");
		driver.quit();
		
	}

}
