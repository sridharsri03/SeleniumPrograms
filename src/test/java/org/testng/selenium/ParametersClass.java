package org.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass  {
	public static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	/*@AfterClass
	public void afterclass() throws Exception {
		Thread.sleep(3000);
		driver.quit();

	}
	@BeforeMethod
	 public void before() {
		Date d = new Date();
		System.out.println("Starting time:"+d);

	}
	 @After
	 public void after() {
		Date d = new Date();
		System.out.println("Ending time:"+d);

	}*/
	
    @Parameters ({"username","password"})
	@Test
	public void test1(String s1,String s2) {
		
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys(s1);
		WebElement f2 = driver.findElement(By.id("pass"));
		f2.sendKeys(s2);
		WebElement f3 = driver.findElement(By.id("u_0_4"));
		f3.click();

	}
	@Parameters ({"password"})
	@Test
	public void test2(@Optional("nisha")String s3) {
		WebElement f2 = driver.findElement(By.id("pass"));
		f2.sendKeys(s3);
		

	}
}
	


