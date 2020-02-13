package org.windowshandling.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleByList{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement f = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		f.click();
		WebElement f1 = driver.findElement(By.xpath("//input[@type='text']"));
		f1.sendKeys("Redmi Note 8 Pro (Electric Blue, 64 GB)");
		WebElement f2 = driver.findElement(By.xpath("//button[@type='submit']"));
		f2.click();
		Thread.sleep(3000);
		WebElement f3 = driver.findElement(By.xpath("(//div[text()='Redmi Note 8 Pro (Electric Blue, 64 GB)'])[1]"));
		f3.click();
		// now we have to handle the window through list
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		List <String> li = new ArrayList<String>();
		li.addAll(all);
		driver.switchTo().window(li.get(1));
		Thread.sleep(2000);
		WebElement f4 = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		f4.click();
	}
}
