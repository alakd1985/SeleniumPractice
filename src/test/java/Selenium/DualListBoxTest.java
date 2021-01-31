package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DualListBoxTest {
	WebDriver driver;

	@BeforeClass
	public void donavigate() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void doMove() throws InterruptedException {
		driver.findElement(By.name("SearchDualList")).sendKeys("Morbi leo risus");
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']")).click();
		Thread.sleep(5000);

	}

	@AfterClass
	public void doClose() {
		driver.quit();
	}
}
