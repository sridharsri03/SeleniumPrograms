package org.DropDown.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionsToolQA {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement SeleniumCommands = driver.findElement(By.id("selenium_commands"));
		Select s = new Select (SeleniumCommands);
		s.selectByIndex(1);
	    s.selectByVisibleText("Wait Commands");
		s.selectByVisibleText("Switch Commands");
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
//		WebElement f= s.getFirstSelectedOption();
//		String text = f.getText();
//		System.out.println(text);
	//	System.out.println(multiple);
		/*s.deselectByIndex(1);
		s.deselectAll();
		List<WebElement> all = s.getAllSelectedOptions();
		for (int i = 0; i <all.size(); i++) {
			WebElement selectedOp = all.get(i);
			String text = selectedOp.getText();
			System.out.println(text);
			
		}*/
	}
}


