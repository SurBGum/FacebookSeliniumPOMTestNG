package com.facebook_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;

	public void openApp() {

		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	public WebElement getUserName() {

		driver.findElement(By.id("email")).sendKeys("Suraia");

		return null;

	}

	public WebElement getpassword() {
		driver.findElement(By.id("pass")).sendKeys("123");
		return null;
	}

	public WebElement getlogin() {

		driver.findElement(By.name("login")).click();
		return null;

	}
	public WebElement getcreateNewAccount(){
	driver.findElement(By.xpath("(//a[@role='button'])[2]" )).click();
	return null;
	}
public WebElement getFirstName() {
	driver.findElement(By.name("firstname")).sendKeys("sur");
	return null;
	
}
public WebElement getLastname() {
	driver.findElement(By.name("lastname")).sendKeys("beg");
	return null;
}
public WebElement getEmailAddress() {
	driver.findElement(By.name("reg_email__")).sendKeys("su@123@gmail");
	return null;
}
/*public WebElement getPassword("password").seendkeys
password
id="day"
id="month"
id='year"*/
}
 