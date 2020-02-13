package org.pomandbase.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass extends BaseClass{
     public POMClass() {
		PageFactory.initElements(driver,this);
	}
 //   @FindBys({@FindBy(id="email"),@FindBy(name="email")})
     @FindBy(id="email")
    private WebElement user;
    
    @FindBy (id="pass")
    private WebElement password;
    
    @FindBy (id="u_0_b")
    private WebElement login;
    
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
}
