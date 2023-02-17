package com.facebook_lognTestwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook_baseTest.BaseTest;
import com.facebook_loginPageWithpagefactory.PageFactoryRegistrationpage;
import com.facebook_loginPageWithpagefactory.PagefactoryLoginPage;

public class PageFactoryRegistrationPageTest extends BaseTest {
	WebDriver driver;
	PagefactoryLoginPage plp;
	
	//@BeforeTest
	@BeforeMethod
	public void init() {
	//driver=openApp();
	driver=openEdge();
	}
	@Test
	public void registrationTest () {
		
		PageFactoryRegistrationpage plp= new PageFactoryRegistrationpage(driver);
		plp.createNewAccount();
		plp.getFirstName("Su");
		plp.getLastName("be");
		plp.getEmailAdress("su@gmail.com");
		plp.getEmailAdress1("su@gmail.com");
		plp.getPassword("123");
		plp.getDay();
		plp.getMonth();
		plp.getYear();
	
	}
	
	/*
	 * @AfterTest public void destroy() { if (driver!=null) { driver.quit(); } }
	 */
	}

	
