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

public class TestWebtable1 {
	WebDriver driver;
	
	@BeforeClass
	public void donavigate()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	
	@Test
	public void doPrint()
	{
		// location of table
		
		WebElement tablelocation=driver.findElement(By.xpath("//section[@class='content']"));
		
		// all rows
		List<WebElement>column=driver.findElements(By.tagName("tr"));
		
		for (WebElement columnvalue : column) 
		{
			String columnText=columnvalue.getText();
			System.out.println(columnText);
		}
	}
	
	@AfterClass
	public void doClose()
	{
		driver.quit();
	}
	

}
