package com.facebook_lognTest;

import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPage;

public class LoginTest {
	//public WebDriver driver;

	@Test
	public void validLoginTest() {
		LoginPage lp = new LoginPage();
		lp.openApp();
		lp.getUserName();
		lp.getpassword();
		lp.getlogin();

	}

	@Test
	public void validLoginTest1() {
		LoginPage lp = new LoginPage();
		lp.openApp();
		lp.getUserName();
		lp.getpassword();
		lp.getlogin();

	}
	// driver.userid
}
