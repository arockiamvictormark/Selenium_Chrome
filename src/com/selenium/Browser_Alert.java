package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://demoqa.com/alerts");
		
		WebElement alertButton = wd.findElement(By.id("alertButton"));
		alertButton.click();
		Thread.sleep(5000);
		wd.switchTo().alert().accept();
		
		WebElement timerAlertButton = wd.findElement(By.id("timerAlertButton"));
		timerAlertButton.click();
		Thread.sleep(10000);
		wd.switchTo().alert().accept();
		
		WebElement confirmButton = wd.findElement(By.id("confirmButton"));
		confirmButton.click();
		Thread.sleep(5000);
		wd.switchTo().alert().dismiss();
		
		WebElement promtButton = wd.findElement(By.id("promtButton"));
		promtButton.click();
		Thread.sleep(5000);
		wd.switchTo().alert().sendKeys("Victor");
		Thread.sleep(10000);
		wd.switchTo().alert().accept();
		
		wd.close();

	}

}
