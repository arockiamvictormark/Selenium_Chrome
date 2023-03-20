package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Hotel_Registration {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://adactinhotelapp.com/");
		
		WebElement login_register = wd.findElement(By.xpath("//a[text()='New User Register Here']"));
		login_register.click();
		
		WebElement username = wd.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("arockiam");
		WebElement password1 = wd.findElement(By.xpath("(//input[@type='password'])[1]"));
		password1.sendKeys("victor");
		WebElement password2 = wd.findElement(By.xpath("(//input[@type='password'])[2]"));
		password2.sendKeys("victor");
		WebElement fullname = wd.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
		fullname.sendKeys("Arockiam Victor Mark");
		WebElement email = wd.findElement(By.xpath("//input[@id='email_add']"));
		email.sendKeys("arockiamvictormark@gmail.com");
		
		Thread.sleep(10000);
		
		WebElement tnc_box = wd.findElement(By.name("tnc_box"));
		tnc_box.click();
		WebElement submit = wd.findElement(By.id("Submit"));
		submit.click();

	}

}
