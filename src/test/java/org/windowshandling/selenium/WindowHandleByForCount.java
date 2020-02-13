package org.windowshandling.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleByForCount {
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
		Thread.sleep(5000);
		WebElement f3 = driver.findElement(By.xpath("(//div[text()='Redmi Note 8 Pro (Electric Blue, 64 GB)'])[1]"));
		f3.click();
		//we have to handle the window now
		//Handle window throw for and if(count)

		//Handle the window using for loop 
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		int count=1;
		for (String x:all) {
			driver.switchTo().window(x);

			if(count==2) {

				System.out.println("handles");
				Thread.sleep(2000);
				WebElement f4 = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
				f4.click();

			}
			count++;	




		}
	}
}

