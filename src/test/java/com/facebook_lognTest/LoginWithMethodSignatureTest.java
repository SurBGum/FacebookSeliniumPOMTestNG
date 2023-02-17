package com.facebook_lognTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPageMethodSignature;

public class LoginWithMethodSignatureTest {
	public WebDriver driver;

	@Test
	public void validLoginTest() {
		LoginPageMethodSignature lpms = new LoginPageMethodSignature();
		lpms.openApp();
		lpms.getUserName("S1");
		lpms.getpassword("yuh");
		lpms.getlogin();

	}

	@Test
	public void validLoginTest1() {
		LoginPageMethodSignature lpms = new LoginPageMethodSignature();
		lpms.openApp();
		lpms.getUserName("Sss");
		lpms.getpassword("yuh");
		lpms.getlogin();

	}
}
