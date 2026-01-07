package org.TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	
	WebDriver driver  = null;
	
	@BeforeMethod
	public void setUp() {
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
	
	}
	
	@Test
	public void jsExecutor() throws InterruptedException {
		
		WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // typeCasting 
		//Child class variable we are storing in to Parent class variable = UpCasting
		
		//send key method
		js.executeScript("arguments[0].setAttribute('value','hari')", inputName);
		
		//click method
		
		WebElement maleRadiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", maleRadiobtn);
		
		//Scroll down the page by pixel number
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll by web element
		WebElement element = driver.findElement(By.xpath("//span[text()=' Kazakhstan ']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll end of the page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
			Thread.sleep(2000);
	
		//scroll up to initial position
		js.executeAsyncScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		//page zooming
		js.executeScript("document.body.style.zoom='50%'");
		
		Thread.sleep(3000);
		
		js.executeScript("document.body.style.zoom='80%'");
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		
//		driver.quit();

	}

}
