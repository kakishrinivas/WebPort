package com.grc.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.grc.qa.base.TestBase;
import com.grc.qa.pages.HomePage;
import com.grc.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() throws IOException {
		super();
	}
	@BeforeTest
	public void setUp() throws IOException{
		intialization();
		loginPage=new LoginPage(); 
	}
	@Test(priority=2)
	public void loginPageTItleTest(){
		String title=loginPage.validatePageTitle();
		Assert.assertEquals(title, "GCR Shop");
	}
	@Test(priority=3)
	public void verifyusernameFieldTest(){
		boolean uname=loginPage.verifyUserNameField();
	    Assert.assertTrue(uname);
	}
	@Test(priority=4)
	public void verifypasswordFieldTest(){
		boolean pwd=loginPage.verifyPasswordField();
		Assert.assertTrue(pwd);
	}
	@Test(priority=5)
	public void verifyLoginBtnTest(){
		boolean loginBtn=loginPage.verifyLoginBtn();
		Assert.assertTrue(loginBtn);
	}
	@Test(priority=6)
	public void verifyLoginBtnEn(){
		boolean loginBtnEn=loginPage.verifyLoginBtnEnb();
		Assert.assertTrue(loginBtnEn);
	}
	/*@Test(priority=7)
	public void verifyCurrentUrl(){
		String url=loginPage.verifyAdminPageUrl();
		Assert.assertEquals(url, "http://www.gcrit.com/build3/admin/login.php","Dynamic values are appending");
	
	}*/
/*	@Test(priority=8)
	public void verifycontentText(){
		String contentText=loginPage.verifyContentText();
		Assert.assertEquals(contentText.contentEquals("Administrator Login"),"Administrator Login");
	}*/
	@Test(priority=9)
	public void verifyAdminLink(){
		boolean adminlink=loginPage.verifyAdminLink();
		Assert.assertTrue(adminlink);
	}
	@Test(priority=10)
	public void verifyCatalogLink(){
		boolean catalogLink=loginPage.verifyCatalogLink();
		Assert.assertTrue(catalogLink);
	}
	@Test(priority=11)
	public void verifySitelink(){
		boolean siteLink=loginPage.verifySiteLink();
		Assert.assertTrue(siteLink);
	}
	@Test(priority=12)
	public void clickonCatalogLink(){
		loginPage.clickonCatalogLink();
	}
	@Test(priority=13)
	public void navigateBack(){
		driver.navigate().back();
	}
	
	@Test(priority=14)
	public void loginTest() throws IOException{
	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	}


