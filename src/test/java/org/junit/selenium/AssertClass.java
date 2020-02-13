package org.junit.selenium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AssertClass extends BaseClassJunit {
	@BeforeClass
	public static void beforeClass() {
		launchBrowser();
		System.out.println("Chrome driver launched sucessfully");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception {
		loadUrl("https://www.facebook.com/");
		WebElement f1 = driver.findElement(By.id("email"));
		fill(f1,"sridhar1996@gmail.com");
		String d = f1.getAttribute("value");
		
		Assert.assertTrue(d.equals("sridhar1996@gmail.com"));
		WebElement f2 = driver.findElement(By.id("pass"));
		fill(f2,"sridhar12345");
		Thread.sleep(2000);
		WebElement f3 = driver.findElement(By.id("u_0_b"));
		f3.click();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110",url);
		System.out.println("Test run sucess");

	}
	@Test
	public void test2() {
		Assert.assertTrue(true);
		System.out.println("sysout 1");
		Assert.assertTrue(false); // it terminate the next assert because it is an hard assert
		System.out.println("sysout 2");
		Assert.assertTrue(true);
		System.out.println("sysout 3");


	}
	@Test
	public void test3() {
		Assert.assertTrue(true);
		System.out.println("sysout 4");
		Assert.assertTrue(true);
		System.out.println("sysout 5");
		Assert.assertTrue(true);
		System.out.println("sysout 6");

	}
}
