package or.alerts.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement f = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	f.click();
	WebElement f1 = driver.findElement(By.xpath("(//button[@onclick='confirmbox()'])[1]"));
	f1.click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(2000);
	a.dismiss();
	
}
}
