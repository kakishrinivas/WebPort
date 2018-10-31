package com.grc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.grc.qa.base.TestBase;

public class RegistrationPage extends TestBase {

	

	//Page Factory - OR
	@FindBy(name="email_address")
	WebElement emailaddress;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="tdb5")
	WebElement sigin;
	
	@FindBy(className="greetUser")
	WebElement getUserName;
	
	
	public RegistrationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public UserHomePage Userlogin(String un,String pwd) throws IOException{
		emailaddress.sendKeys(un);
		password.sendKeys(pwd);
		sigin.click();
		return new UserHomePage();
	}
	public String validatePageTitle(){
		return driver.getTitle();
	}
	public String verifyUserName(){
		return getUserName.getText();
	}
	public String validateCurrentUrl(){
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
	
	
}
