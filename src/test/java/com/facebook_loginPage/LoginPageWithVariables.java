package com.facebook_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageWithVariables {
	WebDriver driver;

	public void openApp() {

		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	public WebElement getUserName(String enterUserName) {
		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys(enterUserName);
		return userName;

	}

	public WebElement getpassword(String enterPassword) {

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(enterPassword);
		return password;

	}

	public WebElement getlogin() {

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		return loginButton;

	}
}
 