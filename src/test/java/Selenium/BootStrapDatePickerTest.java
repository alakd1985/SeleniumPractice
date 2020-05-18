package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BootStrapDatePickerTest {
	WebDriver driver;

	@BeforeClass
	public void donavigate() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void doMove() {
		driver.findElement(By.xpath("//input[@placeholder='Start date']")).sendKeys("04/04/2015");
		
		
	}

	@AfterClass
	public void doClose() {
		driver.quit();
	}
	
}
