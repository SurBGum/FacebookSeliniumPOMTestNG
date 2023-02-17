package com.facebook_FindElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void openApp() {
		//driver=WebDriverManager.chromedriver().create();
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		/*
		 * WebDriverManager.edgedriver().setup(); driver= new EdgeDriver();
		 * driver.get("https://www.facebook.com/");
		 */
	
		
	
	}
	
	@Test
	public void validLoginTest() {
		System.out.println("this is login test");
		invalidLoginTest();
	}
	
	public void invalidLoginTest() {
		System.out.println("this is invalidlogin test");
		
	}

}
