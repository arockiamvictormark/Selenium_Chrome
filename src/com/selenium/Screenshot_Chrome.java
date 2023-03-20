package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Chrome {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver open= new ChromeDriver();
		open.get("https://amazon.com/");
		
		TakesScreenshot tss = (TakesScreenshot) open;
		
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\ScreenShot\\ss1.png");
		
		FileUtils.copyFile(src, des);
		
	}

}
