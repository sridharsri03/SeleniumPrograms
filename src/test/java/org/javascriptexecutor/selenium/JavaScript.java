package org.javascriptexecutor.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor)driver; // Type caste done here
		js.executeScript("arguments[0].setAttribute('value','sridhar')",txtUser); // web element 1 values passed
		WebElement txtPass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','heera')",txtPass); // web element 2 values passed
		Object text = js.executeScript("return arguments[0].getAttribute('value')",txtPass);
		System.out.println(text);
		Thread.sleep(2000);
		WebElement lgButton = driver.findElement(By.id("u_0_2"));
		js.executeScript("arguments[0].click()",lgButton);

	}

}
