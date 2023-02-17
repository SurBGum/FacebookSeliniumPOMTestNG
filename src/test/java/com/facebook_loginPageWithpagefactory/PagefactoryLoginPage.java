package com.facebook_loginPageWithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryLoginPage {
	WebDriver driver;

	public PagefactoryLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy( how = How.ID, using = "email")
	private WebElement userName;

	public WebElement getuserName(String enterUsername) {
		userName.sendKeys(enterUsername);
		 return userName;

	}

	@FindBy(how = How.ID, using = "pass")
	private WebElement Password;

	public WebElement getPassword(String enterPassword) {
		Password.sendKeys(enterPassword);
		return Password;

	}

	@FindBy(how = How.NAME, using = "login")
	private WebElement Login;

	public WebElement getloginButton() {
		Login.click();
		return Login;

	}
	public WebElement getLoginPage(String enterUserName, String enterPassword) {
		this.getuserName(enterUserName);
		this.getPassword(enterPassword);
		return this.getloginButton();
		
	}

}
