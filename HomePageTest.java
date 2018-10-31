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
import com.grc.qa.pages.SignIn;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	RegistrationPage registrationPage;
	SignIn 	signIn;
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void setUp() throws IOException{
		intialization();
		loginPage = new LoginPage(); 
		homePage = new HomePage();
		registrationPage =new RegistrationPage();
		signIn =new SignIn();
	}
	@Test(priority=1)
	public void clickoncatlogLink(){
		loginPage.clickonCatalogLink();
	}
	@Test
	public void verifyPageTitleTest(){
		String homePagetitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePagetitle, "GCR Shop");
	}
/*	@Test(priority=2)
	public void verifyWelcomMsg(){
		String Msg=homePage.verifywelcomeMsg();
		Assert.assertEquals(Msg, "Welcome to GCR Shop");
	}*/
	@Test(priority=3)
	public void verifyloginLink(){
		boolean login=homePage.verifyloginLink();
		Assert.assertTrue(login);
	}
	
	@Test(priority=4)
	public void verifyCreateAccountLink(){
		boolean createAcct=homePage.verifyCreateAccountLink();
		Assert.assertTrue(createAcct);
	}
	@Test(priority=5)
	public void verifyCartBtn(){
		boolean cartBtn=homePage.verifyCartBtn();
		Assert.assertTrue(cartBtn);
	}
	@Test(priority=6)
	public void verifyCheckBtn(){
		boolean checBtn=homePage.verifyCheckoutBtn();
		Assert.assertTrue(checBtn);
	}
	@Test(priority=7)
	public void verifyMyAcctBtn(){
		boolean myAcctBtn=homePage.verifyMyAccountBtn();
				Assert.assertTrue(myAcctBtn);
	}
/*	@Test(priority=8)
	public void clickOnCreateAcctLink(){
		homePage.clickCreateAccount();
		
	}*/
	@Test(priority=9)
	public void clickOnLoginLink() throws IOException{
		homePage.clickonlogin();
		
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
}
