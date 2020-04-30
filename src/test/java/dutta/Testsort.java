package dutta;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testsort {
	WebDriver driver;

	@BeforeClass
	public void donavigate() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/howto_js_sort_table.asp");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void doSorting() {
		/**
		 * Retrieve the List of Items in the Table before Sorting and Store into Array
		 */

		List<WebElement> tdList = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
		String[] array = new String[tdList.size()];
		for (int i = 0; i < tdList.size(); i++) {

			String xString = tdList.get(i).getText();
			System.out.println(xString);
			array[i] = tdList.get(i).getText();

		}
		System.out.println("After sorting of element: ");
//		Arrays.sort(array);
//		for (int i = 0; i < array.length-1; i++) {
//			System.out.println(array[i]);
//		}

		/**
		 * Sort the Array by Swapping the Elements
		 */

		String temp = null;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
			if (array[i].compareTo(array[j]) > 0) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
	}

		// after sorting printing values
		System.out.println("The sorting of Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	@AfterClass
	public void doClose() {
		driver.quit();
	}
}
