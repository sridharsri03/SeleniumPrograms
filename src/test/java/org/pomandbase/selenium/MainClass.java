package org.pomandbase.selenium;

public class MainClass extends BaseClass  {
	public static void main(String[] args) throws Exception {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		POMClass li = new POMClass();
		fill(li.getUser(),"sridharheera123@gmail.com");
		fill(li.getPassword(),"heerasridhar12345");
		click(li.getLogin());
		Thread.sleep(5000);
		quit();
	}
}

