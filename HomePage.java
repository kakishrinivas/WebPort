package com.grc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.grc.qa.base.TestBase;

public class HomePage extends TestBase{
	//Page Factory - OR
	@FindBy(linkText="Online Catalog")
	WebElement catalogLink;
	
	@FindBy(className="contentText")
	WebElement welcomeMsg;
	
	@FindBy(linkText="login")
	WebElement loginLink;
	
	@FindBy(linkText="create an account")
	WebElement createAccount;
	
	@FindBy(id="tdb1")
	WebElement cartBtn;
	
	@FindBy(id="tdb2")
	WebElement checkoutBtn;
	
	@FindBy(id="tdb3")
	WebElement myAccountBtn;
	
		
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public CatalogPage clickonCatalogLink() throws IOException{
		catalogLink.click();
		return new CatalogPage();
	}
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	public String verifywelcomeMsg(){
		return welcomeMsg.getText();
	}
	
	public boolean verifyloginLink(){
		return loginLink.isDisplayed();
	}
	public boolean verifyCreateAccountLink(){
		return createAccount.isDisplayed();
	}
	public boolean verifyCartBtn(){
		return cartBtn.isDisplayed();
	}
	public boolean verifyCheckoutBtn(){
		return checkoutBtn.isDisplayed();
	}
	public boolean verifyMyAccountBtn(){
		return myAccountBtn.isDisplayed();
	}
	public RegistrationPage clickCreateAccount() throws IOException{
		createAccount.click();
		return new RegistrationPage();
	}
	public SignIn clickonlogin() throws IOException{
		loginLink.click();
		return new SignIn();
	}

}
