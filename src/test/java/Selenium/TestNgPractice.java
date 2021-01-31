package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice {
	@BeforeTest
	public void gotoNavigation() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void exitNavigation() {
		System.out.println("@AfterTest");
	}

	@BeforeClass
	public void beforeNavigation() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterNavigation() {
		System.out.println("@AfterClass");
	}

	@BeforeMethod
	public void gotoHomePage() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void exitHomePage() {
		System.out.println("@AfterMethod");
	}

	@Test(invocationCount = 3)
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

	@Test(enabled = true)
	public void test3() {
		System.out.println("test3");
	}

	@Test(groups = "a")
	public void test4() {
		System.out.println("test4");
	}

	@Test(groups = "a")
	public void test5() {
		System.out.println("test5");
	}

	@Test
	public void test6() {
		System.out.println("test6");
	}

	@Test
	public void test7() {
		System.out.println("test7");
	}
}
