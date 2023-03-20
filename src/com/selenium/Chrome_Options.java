package com.selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrome_Options {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("incognito");
		WebDriver wd = new ChromeDriver(co);
		wd.get("https://www.facebook.com/");
		wd.manage().window().maximize();
		
		Capabilities cap = ((RemoteWebDriver)wd).getCapabilities();
		String browserName = cap.getBrowserName();
		System.out.println("Browser Name: "+browserName);
		String browserVersion = cap.getBrowserVersion();
		System.out.println("Browser Version: "+browserVersion);		
		
	}

}
