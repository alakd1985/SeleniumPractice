package dutta;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HighlightTest {

	public WebDriver driver;
	

	@BeforeClass
	public void doOpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void dologin() {
		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		//he = new HighlightElement(driver);
		// he.doHighlight(firstName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute" + "('style','background: yellow; border: 2px solid red;');",
				firstName);
		firstName.sendKeys("alak");
	}

	@AfterClass
	public void doClose() {
		driver.close();
	}
}
