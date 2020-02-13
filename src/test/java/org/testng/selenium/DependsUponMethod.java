package org.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsUponMethod {
	public static WebDriver driver;
	@Test
	private void tc1() {
		Assert.assertTrue(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	@Test (dependsOnMethods = "tc1")
	private void tc2() {
		driver.findElement(By.id("email")).sendKeys("sridhar24423@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678997656");
		System.out.println("Success");
	}

}
