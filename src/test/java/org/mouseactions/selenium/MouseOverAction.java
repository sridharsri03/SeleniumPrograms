package org.mouseactions.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc = new Actions (driver);
		acc.moveToElement(f1).perform();
		Thread.sleep(2000);
		WebElement f2 = driver.findElement(By.xpath("//span[contains(text(),'Oracle Training ')]"));
		acc.moveToElement(f2).perform();
		Thread.sleep(2000);
		WebElement f3 = driver.findElement(By.xpath("//span[contains(text(),'Oracle HRMS Training')]"));
		acc.moveToElement(f3).perform();
		Thread.sleep(2000);
		f3.click();

	}

}
