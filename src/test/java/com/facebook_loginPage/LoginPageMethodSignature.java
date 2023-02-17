package com.facebook_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageMethodSignature {
	WebDriver driver;

	public void openApp() {

		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	public WebElement getUserName(String enterUserName) {

		driver.findElement(By.id("email")).sendKeys(enterUserName);

		return null;

	}

	public WebElement getpassword(String enterPassword) {
		driver.findElement(By.id("pass")).sendKeys(enterPassword);
		return null;
	}

	public WebElement getlogin() {

		driver.findElement(By.name("login")).click();
		return null;

	}
}
 