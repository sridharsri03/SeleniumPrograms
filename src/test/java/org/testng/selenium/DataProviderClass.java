package org.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderClass {
static WebDriver driver;
@Test (dataProvider ="data",dataProviderClass = DpSample.class)
private void test1(String s1,String s2,String s3) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement f1 = driver.findElement(By.id("email"));
	f1.sendKeys(s1);
	WebElement f2 = driver.findElement(By.id("pass"));
	f2.sendKeys(s2);
	WebElement f3 = driver.findElement(By.id("u_0_m"));
	f3.sendKeys(s3);

}
/*@DataProvider(name="data")
private Object [][]data(){
	return new Object[][] {{"sridharsri","125478542","nishasri"},{"velualu","2484740","dhalulaljf"},{"abinaya","249874","abiabi"}};
	
}*/

}
