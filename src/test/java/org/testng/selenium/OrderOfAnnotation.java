package org.testng.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfAnnotation {
@BeforeSuite
private void beforesuite() {
	System.out.println("before suite");

}
@AfterSuite
private void aftersuite() {
	System.out.println("after suite");

}
@BeforeTest
private void beforetest() {
	System.out.println("before test");

}
@AfterTest
private void aftertest() {
	System.out.println("After test");

}
@BeforeMethod
private void beforemethod() {
	System.out.println("before method");
}
@AfterMethod
private void aftermethod() {
	System.out.println("After Method");

}
@BeforeClass
private void beforeclass() {
System.out.println("Befor class");
}
@AfterClass
private void afterclass() {
	System.out.println("After Class");
}
@Test
private void test1() {
	System.out.println("Test 1");
}


}
