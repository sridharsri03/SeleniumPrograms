package org.testng.selenium;

import org.testng.annotations.DataProvider;

public class DpSample {
	@DataProvider(name="data")
	private Object [][]data(){
		return new Object[][] {{"sridharsri","125478542","nishasri"},{"velualu","2484740","dhalulaljf"},{"abinaya","249874","abiabi"}};
}
}
