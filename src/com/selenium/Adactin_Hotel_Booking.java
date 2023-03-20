package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel_Booking {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://adactinhotelapp.com/");
		
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys("arockiam");
		WebElement password = wd.findElement(By.id("password"));
		password.sendKeys("victor");
		WebElement login_button = wd.findElement(By.className("login_button"));
		login_button.click();
		
		Thread.sleep(3000);
		
		WebElement location = wd.findElement(By.id("location"));
		Select locationSelect = new Select(location);
		locationSelect.selectByIndex(6);
		WebElement hotels = wd.findElement(By.id("hotels"));
		Select hotelsSelect = new Select(hotels);
		hotelsSelect.selectByIndex(3);
		WebElement room_type = wd.findElement(By.id("room_type"));
		Select room_typeSelect = new Select(room_type);
		room_typeSelect.selectByValue("Super Deluxe");
		WebElement room_nos = wd.findElement(By.id("room_nos"));
		Select room_nosSelect = new Select(room_nos);
		room_nosSelect.selectByIndex(2);
		WebElement datepick_in = wd.findElement(By.id("datepick_in"));
		datepick_in.clear();
		datepick_in.sendKeys("03/12/2022");
		WebElement datepick_out = wd.findElement(By.id("datepick_out"));
		datepick_out.clear();
		datepick_out.sendKeys("04/12/2022");
		WebElement adult_room = wd.findElement(By.id("adult_room"));
		Select adult_roomSelect = new Select(adult_room);
		adult_roomSelect.selectByValue("2");
		WebElement child_room = wd.findElement(By.id("child_room"));
		Select child_roomSelect = new Select(child_room);
		child_roomSelect.selectByVisibleText("2 - Two");
		
		WebElement search = wd.findElement(By.xpath("//input[@value='Search']"));
		search.click();
		
		Thread.sleep(3000);
		
		WebElement radioSelect = wd.findElement(By.id("radiobutton_0"));
		radioSelect.click();
		WebElement continueSearch = wd.findElement(By.id("continue"));
		continueSearch.click();
		
		Thread.sleep(3000);
		
		WebElement first_name = wd.findElement(By.id("first_name"));
		first_name.sendKeys("Arockiam Victor");
		WebElement last_name = wd.findElement(By.id("last_name"));
		last_name.sendKeys("Mark");
		WebElement address = wd.findElement(By.id("address"));
		address.sendKeys("Besant Nagar, Chennai");
		WebElement cc_num = wd.findElement(By.id("cc_num"));
		cc_num.sendKeys("1234567887654321");
		WebElement cc_type = wd.findElement(By.id("cc_type"));
		Select cc_typeSelect = new Select(cc_type);
		cc_typeSelect.selectByIndex(1);
		WebElement cc_exp_month = wd.findElement(By.id("cc_exp_month"));
		Select cc_exp_monthSelect = new Select(cc_exp_month);
		cc_exp_monthSelect.selectByValue("10");
		WebElement cc_exp_year = wd.findElement(By.id("cc_exp_year"));
		Select cc_exp_yearSelect = new Select(cc_exp_year);
		cc_exp_yearSelect.selectByVisibleText("2022");
		WebElement cc_cvv = wd.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys("123");
		WebElement book_now = wd.findElement(By.id("book_now"));
		book_now.click();
		
		Thread.sleep(10000);
		
		WebElement my_itinerary = wd.findElement(By.id("my_itinerary"));
		my_itinerary.click();
		
		Thread.sleep(3000);
		
		WebElement checkbox = wd.findElement(By.xpath("(//input[@name='ids[]'])[1]"));
		checkbox.click();
		WebElement cancelall = wd.findElement(By.name("cancelall"));
		cancelall.click();
		WebElement logout = wd.findElement(By.id("logout"));
		logout.click();
		
	}

}
