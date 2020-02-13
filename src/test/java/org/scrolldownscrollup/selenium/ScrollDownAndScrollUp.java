package org.scrolldownscrollup.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndScrollUp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement f2 = driver.findElement(By.xpath("//p[text()=' Interview Questions']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",f2);//down
		Thread.sleep(3000);
		WebElement f1 = driver.findElement(By.xpath("(//img[@title='Testimonials'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)",f1);//up
		
		

	}

}
