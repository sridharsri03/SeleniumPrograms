package org.DropDown.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionsFB {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ddnmonths = driver.findElement(By.id("month"));
		Select s = new Select(ddnmonths);
		//s.selectByIndex(5);
		//s.selectByValue("6");
		s.selectByVisibleText("Mar");
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			WebElement months = op.get(i);
			String text = months.getText();
			System.out.println(text);
			
		}
	}

}
