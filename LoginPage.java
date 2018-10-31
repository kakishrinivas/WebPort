package com.grc.qa.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.grc.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Page Factory - OR
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="tdb1")
	WebElement loginBtn;
	
	@FindBy(id="contentText")
	WebElement contentText;
	
	@FindBy(linkText="Administration")
	WebElement administrationLink;
	
	@FindBy(linkText="Online Catalog")
	WebElement catalogLink;
	
	@FindBy(linkText="Support Site")
	WebElement siteLink;

	//Constructor-Initializing the Page Object
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	//Action
	public String validatePageTitle(){
		return driver.getTitle();
	}
	public boolean verifyUserNameField(){
		return username.isDisplayed();
	}
	public boolean verifyPasswordField(){
		return password.isDisplayed();
	}
	public boolean verifyLoginBtn(){
		return loginBtn.isDisplayed();
	}
	public boolean verifyLoginBtnEnb(){
		return loginBtn.isEnabled();
	}
	public String verifyAdminPageUrl(){
		return driver.getCurrentUrl();
	}
	public String verifyContentText(){
		return contentText.getText();
	}
	public boolean verifyAdminLink(){
		return administrationLink.isDisplayed();
	}
	public boolean verifyCatalogLink(){
		return catalogLink.isDisplayed();
	}
	public boolean verifySiteLink(){
		return siteLink.isDisplayed();
	}
	public void clickonCatalogLink(){
		catalogLink.click();
	}
	
	public HomePage login(String un,String pwd) throws IOException{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}

}
