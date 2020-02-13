package org.testng.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class HardAssertAndSoftAssert {
	@Test
	private void test1() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);

	}
	@Test
	private void test2() {
		SoftAssert s= new SoftAssert();
		s.assertTrue(true);
		s.assertFalse(false);
		s.assertTrue(true);

	}
	@Test
	private void test3() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		

	}
	@Test
	private void test4() {
		SoftAssert s = new SoftAssert();
		s.assertTrue(true);
		s.assertTrue(true);
		s.assertTrue(false);
		s.assertTrue(true);
		s.assertAll();

	}

}
