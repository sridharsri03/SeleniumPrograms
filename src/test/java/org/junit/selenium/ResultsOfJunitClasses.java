package org.junit.selenium;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ResultsOfJunitClasses {
public static void main(String[] args) {
	Result rs = JUnitCore.runClasses(AssertClass.class,IgnoreAnnotation.class,AssertClass.class);
	System.out.println("Run Count"+rs.getRunCount());
	System.out.println("Run Time"+rs.getRunTime());
	System.out.println("Ignore Count"+rs.getIgnoreCount());
	System.out.println("Failure Count"+rs.getFailureCount());
	List<Failure>fail =rs.getFailures();
	for (Failure x : fail) {
		System.out.println("Failure tests:"+x);
		
	}
	boolean s = rs.wasSuccessful();
	System.out.println("test is pass/fail:"+s);
}
}
