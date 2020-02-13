package or.alerts.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.xpath("(//a[text()='Alert with Textbox '])[1]"));
		f1.click();
		Thread.sleep(2000);
		WebElement f2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		f2.click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.sendKeys("heera");
		a.accept();
	}

}
