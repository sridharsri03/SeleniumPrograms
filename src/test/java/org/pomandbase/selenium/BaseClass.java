package org.pomandbase.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	public static void loadUrl(String s) {
		driver.get(s);

	}
	public static void  fill(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void click(WebElement e) {
		e.click();

	}
	public static void  sbv(WebElement e,String s1) {
		Select s = new Select(e);
		s.selectByValue(s1);
	}
	public static void sbi(WebElement e,int i) {
		Select s = new Select(e);
		s.selectByIndex(i);

	}
	public static void  quit() {
		driver.quit();

	}
	public static String getCurrentUrl() {
		String s1 = driver.getTitle();
		return s1;

	}

}
