package com.facebook_baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
	String browser = "chrome";

	public WebDriver openApp() {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

			return driver;

		} else if (browser.equalsIgnoreCase("edge")) {

			// WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();

			return driver;
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println(browser + " : This is not a valid Browser");
		}

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public WebDriver openChrome() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public WebDriver openEdge() {

		// WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public WebDriver openFirefox() {
		// WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	/*
	 * public void closeApp() { if (driver!=null) { driver.quit(); } }
	 */
}
