package org.webtable.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First3rows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table");
		driver.manage().window().maximize();
		List<WebElement> Trows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i <Trows.size()-3; i++) {
			WebElement eachrow = Trows.get(i);
			String text = eachrow.getText();
			System.out.println(text);
			
			
		}
			
		}
	}


