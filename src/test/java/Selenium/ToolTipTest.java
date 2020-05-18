package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTipTest {
	WebDriver driver;

	@BeforeClass
	public void donavigate() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void doToolTip() {
		
		WebElement toolElement = driver.findElement(By.cssSelector("a[id='download_now']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(toolElement).build().perform();
		String tooltip = toolElement.getText();
		
	}

	@AfterClass
	public void doClose() {
		driver.quit();
	}
	
}
