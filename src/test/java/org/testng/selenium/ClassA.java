package org.testng.selenium;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ClassA {
	@Test //(retryAnalyzer = Retry.class)
	public void tc1() {
		System.out.println("test1");
		Assert.assertTrue(false);

	}
	@Test
	public void tc2() {
		System.out.println("test2");
		Assert.assertTrue(true);
	}
	@Test
	public void tc3() {
		System.out.println("test3");
		Assert.assertTrue(true);


	}
	@Test
	public void tc4() {
		System.out.println("test4");
		Assert.assertTrue(true);


	}
}
