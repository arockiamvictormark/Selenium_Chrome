package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Incognito {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("incognito");
		co.addArguments("new tab");
		
		WebDriver incog = new ChromeDriver(co);
		incog.get("https://www.facebook.com/");
		
	}

}
