package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_Chrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver open= new ChromeDriver();
		open.get("https://adactinhotelapp.com/");
		
		WebElement login_register = open.findElement(By.xpath("//a[contains(text(),'Register')]"));
		login_register.click();

	}

}
