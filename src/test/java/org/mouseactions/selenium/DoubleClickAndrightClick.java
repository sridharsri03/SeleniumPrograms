package org.mouseactions.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndrightClick {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys("sridhar@gmail.com");
		WebElement f2 = driver.findElement(By.id("pass"));
		f2.sendKeys("sridhar23344");
		Actions acc = new Actions(driver);
		acc.doubleClick(f2).perform();
		Thread.sleep(3000);
		acc.contextClick(f1).perform();
		
	}
	
}
