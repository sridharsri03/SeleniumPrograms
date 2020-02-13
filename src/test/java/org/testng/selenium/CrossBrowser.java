package org.testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	public static WebDriver driver;
	@Parameters ({"Browser"})
	@Test
	private void tc1(String s1) {
		if(s1.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		else if (s1.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\geckodriver.exe ");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
		if (s1.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://www.facebook.com/");
		}
	}
}

