package com.grc.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.grc.qa.base.TestBase;
import com.grc.qa.pages.HomePage;
import com.grc.qa.pages.LoginPage;
import com.grc.qa.pages.RegistrationPage;
import com.grc.qa.pages.UserHomePage;

public class RegstrationPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	RegistrationPage registrationPage;
	//SignIn 	signIn;
	UserHomePage userHomePage;
	
	public RegstrationPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setUp() throws IOException{
		intialization();
		loginPage = new LoginPage(); 
		homePage = new HomePage();
		registrationPage =new RegistrationPage();
		//signIn =new SignIn();
	}
	@Test(priority=1)
	public void clickoncatlogLink(){
		loginPage.clickonCatalogLink();
	}
	@Test(priority=2)
	public void clickOnLoginLink() throws IOException{
		homePage.clickonlogin();
	}

	@Test(priority=3)
	public void loginTest1() throws IOException{
		userHomePage=registrationPage.Userlogin(prop.getProperty("uname"), prop.getProperty("pwd"));
	}
	@Test(priority=4)
	public void loginPageTitleTest(){
		String title=loginPage.validatePageTitle();
		Assert.assertEquals(title, "GCR Shop");
	}
	@Test(priority=5)
	public void verifyUserName(){
		String uName=registrationPage.verifyUserName();
		Assert.assertEquals(uName, "Nirnay!");
	}
	@Test(priority=5)
	public void verifyUrl(){
		String uName=registrationPage.validateCurrentUrl();
		Assert.assertEquals(uName, "http://www.gcrit.com/build3/index.php");
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
