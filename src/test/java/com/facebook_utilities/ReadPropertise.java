package com.facebook_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertise {
	private Properties properties;

	public ReadPropertise() {
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/test.propertise");
			properties.load(fis);
		} catch (IOException e) {
			System.out.println("Could not find the file : " + e.getMessage());

		}

	}

	public String propertiseUrl() {
		String url = properties.getProperty("URL");
		System.out.println("what is the url: " + url);
		return url;
	}

	public String propertiseUserName() {
		return properties.getProperty("UserName");
	}

	public String propertisePasword() {
		return properties.getProperty("Password");
	}

	public String propertiseBrowser() {
		return properties.getProperty("Browser");
	}

	public static void main(String[] args) {
		ReadPropertise rp = new ReadPropertise();
		System.out.println(rp.propertiseUrl());
		System.out.println(rp.propertiseBrowser());
	}
}
