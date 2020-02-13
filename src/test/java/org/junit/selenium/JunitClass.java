package org.junit.selenium;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitClass extends BaseClassJunit {
 @BeforeClass
 public static void beforeClass() {
	launchBrowser();
	System.out.println("Chrome driver launched sucessfully");
    driver.manage().window().maximize();
}
 @AfterClass
 public static void afterClass() {
	qiut();
}
 @Before
 public void before() {
	Date d = new Date();
	System.out.println("Starting time:"+d);

}
 @After
 public void after() {
	Date d = new Date();
	System.out.println("Ending time:"+d);

}
 @Test
 public void test1() throws Exception {
	 loadUrl("https://www.facebook.com/");
	 WebElement f1 = driver.findElement(By.id("email"));
	 fill(f1, "sridhar@gmail.com");
	 WebElement f2 = driver.findElement(By.id("pass"));
	 fill(f2, "sridhar1234");
	 WebElement f3 = driver.findElement(By.id("u_0_b"));
	 click(f3);
	 System.out.println("Test1 run sucessfully");
Thread.sleep(5000);
}
}
