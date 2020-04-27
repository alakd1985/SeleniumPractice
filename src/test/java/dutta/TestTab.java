package dutta;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTab {

	public WebDriver driver;
	String parentWindow;
	Set<String> windowSet;

	@BeforeClass
	public void donavigate() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void doMove() throws InterruptedException {
		parentWindow = driver.getWindowHandle();
		WebElement newBrowser = driver.findElement(By.id("win1"));
		newBrowser.click();

		windowSet = driver.getWindowHandles();
		for (String handle : windowSet) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);

	}

	@Test
	public void doOpentab() {
		
		WebElement smallWindow = driver.findElement(By.id("win2"));
		smallWindow.click();
		windowSet = driver.getWindowHandles();
		
		for (String handle : windowSet) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);

	}

	@AfterClass
	public void doClose() {
		driver.close();
	}
}
