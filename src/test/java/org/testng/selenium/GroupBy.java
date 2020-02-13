package org.testng.selenium;

import org.testng.annotations.Test;

public class GroupBy {
	@Test (groups="login")
	private void test1() {
		System.out.println("login");

	}
	@Test (groups="register")
	private void test2() {
System.out.println("register page");

	}
	@Test (groups="login")
	private void test3() {
		System.out.println("login");

	}
	@Test (groups="register")
	private void test4() {
		System.out.println("register page");

	}
	@Test (groups="login")
	private void test5() {
		System.out.println("login");

	}
	@Test (groups="register")
	private void test6() {
		System.out.println("register page");

	}
	@Test (groups="login")
	private void test7() {
		System.out.println("login");

	}
	@Test (groups="register")
	private void test8() {
		System.out.println("register page");

	}
}
