package org.keyboardactions.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPasteActions {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement f1 = driver.findElement(By.id("email"));
	f1.sendKeys("sridhar@gmail.com");
    
    Actions acc = new Actions(driver);
    acc.doubleClick().contextClick().build().perform();
    Thread.sleep(2000);
    Robot r = new Robot();
    for (int i = 0; i < 5; i++) {
    	r.keyPress(KeyEvent.VK_DOWN);
	}
    r.keyPress(KeyEvent.VK_ENTER);
    WebElement f2 = driver.findElement(By.id("pass"));
    f2.click();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
    
   
}
}
