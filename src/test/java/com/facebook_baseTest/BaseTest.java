package com.facebook_baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.facebook_utilities.ReadPropertise;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	String browser = "chrome";

	private ReadPropertise readPropertise;
	
	public WebDriver openApp() {
		readPropertise = new ReadPropertise();
		String facebookUrl = readPropertise.propertiseUrl();
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(facebookUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			return driver;

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(facebookUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			return driver;
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println(browser + " : This is not a valid Browser");
		}

		driver.get(facebookUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//return driver;
		return driver;
	}

	public WebDriver openChrome() {

		driver = new ChromeDriver();
		driver.get(readPropertise.propertiseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public WebDriver openEdge() {

		// WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.get(readPropertise.propertiseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public WebDriver openFirefox() {
		// WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.get(readPropertise.propertiseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	/*
	 * public void closeApp() { if (driver!=null) { driver.quit(); } }
	 */
}
