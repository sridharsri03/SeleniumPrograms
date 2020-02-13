package org.mouseactions.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement f1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement f2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions acc = new Actions(driver);
		acc.dragAndDrop(f1,f2).perform();
	}

}
