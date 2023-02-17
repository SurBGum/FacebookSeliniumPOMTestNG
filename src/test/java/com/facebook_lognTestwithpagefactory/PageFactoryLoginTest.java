package com.facebook_lognTestwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook_baseTest.BaseTest;
import com.facebook_loginPageWithpagefactory.PagefactoryLoginPage;

public class PageFactoryLoginTest extends BaseTest {
	WebDriver driver;
	private PagefactoryLoginPage plp;
@BeforeMethod
public void init() {
	driver=openApp();

}
	

@Test
public void validUserNameTest() {
	plp = new PagefactoryLoginPage(driver);
	plp.getuserName("Suria123");
	plp.getPassword("123");
	plp.getloginButton();
}
@Test
public void validPasswordTest() {
    plp = new PagefactoryLoginPage(driver);
	plp.getuserName("Suria123");
	plp.getPassword("123");
	plp.getloginButton();
}
@Test
public void doLoginTest() {
	plp = new PagefactoryLoginPage(driver);
	plp.getLoginPage("faruq123", "faruq321");
}
@AfterMethod
public void closeApp() {
	if(driver != null) {
		//driver.quit();
	}
	
}
}
