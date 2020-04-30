package dutta;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testslide {

	public WebDriver driver;
	@BeforeClass
	public void doNavigate()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@Test
	public void doSlide() {
		WebElement sliding =  driver.findElement(By.xpath("//div[@id='slider']"));
		new Actions(driver).dragAndDropBy(sliding, 100, 0).build().perform();
	}
	
	@Test
	public void doSlide1()
	{
		driver.navigate().to("https://jqueryui.com/slider/");
		WebElement framElement = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(framElement);
		
		//driver.switchTo().frame("demo-frame");
		WebElement sliding1 = driver.findElement(By.cssSelector("div[id='slider']"));
		new Actions(driver).dragAndDropBy(sliding1, 100, 0).build().perform();
		
	}
	@AfterClass
	public void doClose() 
	{
		driver.quit();
	}
}
