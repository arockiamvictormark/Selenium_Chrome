package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Task_Chrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver open= new ChromeDriver();
		open.get("http://automationpractice.com/index.php");
		
		WebElement signIn = open.findElement(By.className("login"));
		signIn.click();
		
		Thread.sleep(5000);
		System.out.println("==================================================1");
		WebElement emailCreate = open.findElement(By.id("email_create"));
		emailCreate.sendKeys("arockiamvictormark1@gmail.com");
		WebElement createAccount = open.findElement(By.id("SubmitCreate"));
		createAccount.click();

		Thread.sleep(15000);
		System.out.println("==================================================2");
		WebElement selectGender = open.findElement(By.id("id_gender1"));
		selectGender.click();
		WebElement customerFirstname = open.findElement(By.id("customer_firstname"));
		customerFirstname.sendKeys("Arockiam Victor");
		WebElement customerLastname = open.findElement(By.id("customer_lastname"));
		customerLastname.sendKeys("Mark");
		WebElement passwd = open.findElement(By.id("passwd"));
		passwd.sendKeys("Arockiam@123");
		WebElement address = open.findElement(By.id("address1"));
		address.sendKeys("Besant Nagar");
		WebElement city = open.findElement(By.id("city"));
		city.sendKeys("Chennai");
		
		WebElement id_state = open.findElement(By.id("id_state"));
		Select selectState = new Select(id_state);
		selectState.selectByVisibleText("Indiana");
		
		WebElement postcode = open.findElement(By.id("postcode"));
		postcode.sendKeys("60090");
		WebElement phoneMobile = open.findElement(By.id("phone_mobile"));
		phoneMobile.sendKeys("9884140049");
		WebElement alias = open.findElement(By.id("alias"));
		alias.clear();
		alias.sendKeys("BesantNagarAddress");
		
		WebElement register = open.findElement(By.id("submitAccount"));
		register.click();

	}

}
