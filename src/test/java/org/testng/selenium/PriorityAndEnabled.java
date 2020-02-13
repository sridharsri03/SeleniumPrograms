package org.testng.selenium;

import org.testng.annotations.Test;

public class PriorityAndEnabled {
@Test (priority=-10) // based on priority it execute the test cases...
private void test1() {
	System.out.println("Test 1");
}
@Test(priority=-8)
private void test2() {
	System.out.println("Test 2");

}
@Test(priority=-9)
private void test3() {
	System.out.println("Test 3");

}
@Test 
private void test4() {
	System.out.println("Test 4");

}
@Test(priority= 1)
private void test5() {
	System.out.println("Test 5");

}
@Test(enabled=false) //it won't execute the test because of (enabled = false)
private void test6() {
	System.out.println("Test 6");

}

}
