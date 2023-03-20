package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.facebook.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("alert('Welcome to FB')");
		Thread.sleep(3000);
		wd.switchTo().alert().accept();
		
		jse.executeScript("confirm('do you want to login?')");
		Thread.sleep(3000);
		wd.switchTo().alert().dismiss();
		
		jse.executeScript("prompt('what is your name?')");
		wd.switchTo().alert().sendKeys("Victor");
		Thread.sleep(3000);
		String text = wd.switchTo().alert().getText();
		System.out.println(text);
		wd.switchTo().alert().accept();
		
		wd.close();

	}

}
