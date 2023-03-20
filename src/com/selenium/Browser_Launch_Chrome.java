package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch_Chrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		
		WebDriver open= new ChromeDriver();
		
		open.get("https://www.google.co.in/");		
		open.manage().window().minimize();
		open.manage().window().maximize();
		open.manage().window().fullscreen();
		Dimension windowSize = open.manage().window().getSize();
		System.out.println("Window Size: "+windowSize);
		
		Dimension newSize = new Dimension(750, 500);
		open.manage().window().setSize(newSize);
		
		open.navigate().to("https://www.flipkart.com/");
		open.navigate().back();
		open.navigate().forward();
		Thread.sleep(5000);
		open.navigate().refresh();
		String title = open.getTitle();
		System.out.println("Title: "+title);
		
		String currentUrl = open.getCurrentUrl();
		System.out.println("Current URL: "+currentUrl);
		
//		String pageSource = open.getPageSource();
//		System.out.println("Page Source: "+pageSource);
		
		open.close();
		open.quit();
		
	}

}
