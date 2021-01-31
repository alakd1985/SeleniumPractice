package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SlideTest {

	public WebDriver driver;

	@BeforeTest
	public void doNavigate() {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	/*
	 * @Test(priority = 1) public void doSlide() { WebElement sliding =
	 * driver.findElement(By.xpath("//div[@id='slider']")); new
	 * Actions(driver).dragAndDropBy(sliding, 100, 0).build().perform(); }
	 */

	@Test(priority = 2)
	public void doSlide1() {
		driver.navigate().to("https://jqueryui.com/slider/");
		WebElement frameElement = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(frameElement);

		// driver.switchTo().frame("demo-frame");
		WebElement sliding1 = driver.findElement(By.cssSelector("div[id='slider']"));
		new Actions(driver).dragAndDropBy(sliding1, 100, 0).perform();
	}

	@AfterTest
	public void doClose() {
		driver.quit();
	}
}
