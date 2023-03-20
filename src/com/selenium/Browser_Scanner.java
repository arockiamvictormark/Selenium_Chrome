package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Scanner {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		
		System.out.println("Enter website name to open: ");
		
		Scanner sc = new Scanner(System.in);
		String webAddress = sc.next();
		sc.close();

		if(webAddress.equalsIgnoreCase("amazon")) {
			System.out.println("Website to open: Amazon");
		}
		else if(webAddress.equalsIgnoreCase("facebook") || webAddress.equalsIgnoreCase("fb")) {
			System.out.println("Website to open: Facebook");
		}
		else {
			System.out.println("Website to open: Google");
		}
		
		WebDriver open = new ChromeDriver();
		
		if(webAddress.equalsIgnoreCase("amazon")) {
			open.get("https://www.amazon.com/");
		}
		else if(webAddress.equalsIgnoreCase("facebook") || webAddress.equalsIgnoreCase("fb")){
			open.get("https://www.facebook.com/");
		}
		else {
			open.get("https://www.google.co.in/");
		}
		
	}

}
