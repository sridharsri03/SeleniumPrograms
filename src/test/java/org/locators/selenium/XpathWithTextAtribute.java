package org.locators.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithTextAtribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
		driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.xpath("//input[@name='email']"));//X-path----Attribute name and value.
		f1.sendKeys("sridharheera");
		String attributeValue = f1.getAttribute("value");
	    System.out.println(attributeValue);
		WebElement f2 = driver.findElement(By.xpath("//span[text()='Log in to Facebook']"));//X-path----Text and getText method();
		String text = f2.getText();
		System.out.println(text);
		WebElement f3 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));//X-path----Contain text
		f3.click();
	}

}
