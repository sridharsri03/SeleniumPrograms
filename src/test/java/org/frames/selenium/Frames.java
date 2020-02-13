package org.frames.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		WebElement e = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		e.click();
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String x:all) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);
				Thread.sleep(2000);
				WebElement f = driver.findElement(By.id("awf_field-93653884"));
				f.sendKeys("Sridhar");
				
			}
			
		}
		
		
	}

}
