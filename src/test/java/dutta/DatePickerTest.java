package dutta;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePickerTest {
	public WebDriver driver;


	@BeforeClass
	public void donavigate() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void doMove() {
		WebElement textbx = driver.findElement(By.id("datepicker"));
		textbx.click();
		WebElement calender = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		List<WebElement> rows = driver.findElements(By.tagName("td"));

		for (WebElement r : rows) {
			String allrow = r.getText();
			System.out.println(allrow);
			if (allrow.equalsIgnoreCase("15")) {
				driver.findElement(By.linkText("15")).click();
				break;
			}
		}
	}

	@AfterClass
	public void doClose() {
		driver.quit();
	}
}
