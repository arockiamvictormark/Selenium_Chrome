package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		
		WebDriver open= new ChromeDriver();
		
//		open.get("https://www.facebook.com/");
//		
//		WebElement email = open.findElement(By.id("email"));
//		email.sendKeys("Arockiam Victor Mark");
//		email.clear();
//		email.sendKeys("Victor Mark");
//		
//		WebElement login = open.findElement(By.name("login"));
//		login.click();
		
		open.get("https://www.amazon.com/");
		
		WebElement searchbox = open.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("printer ink");
		String getText = searchbox.getText();
		System.out.println("Search Box: "+getText);
		WebElement submit_button = open.findElement(By.id("nav-search-submit-button"));
		submit_button.click();

	}

}
