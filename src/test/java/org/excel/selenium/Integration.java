package org.excel.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Integration extends BaseClassExcel {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys(getData(0,0));
		WebElement f2 = driver.findElement(By.id("pass"));
		f2.sendKeys(getData(1,0));
		WebElement f3 = driver.findElement(By.id("loginbutton"));
		f3.click();
	}

}
