package Selenium;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebtableTest {
	WebDriver driver;

	@BeforeClass
	public void doNavigate() {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/WebTable.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Test
	public void doPrintTableData() {

		// Identify the table

		WebElement tablElement = driver
				.findElement(By.xpath("//table[@class='table table-hover table-responsive table-list-search']"));

		// get all the rows

		List<WebElement> rowsList = driver.findElements(By.tagName("td"));
		List<WebElement>coList=driver.findElements(By.tagName("tr"));

		for (WebElement rows : rowsList) {

			String Actual = rows.getText();
			System.out.println(Actual);

		}
		
		for (WebElement column : coList) {

			String Actual = column.getText();
			System.out.println(Actual);

		}

//		for (WebElement rows : rowsList) 
//		{
//			List<WebElement>column= driver.findElements(By.tagName("tr"));
//			for (WebElement cols : column) {
//				String Actual = cols.getText(); 
//				  System.out.println(Actual);
//			}
//			  
//		}

	}

	@AfterClass
	public void doClose() {
		driver.close();
	}
}
