package com.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://demoqa.com/select-menu");
		
		WebElement oldSelect = wd.findElement(By.id("oldSelectMenu"));
		Select s = new Select(oldSelect);
		s.selectByValue("5");
		System.out.println("oldSelectMenu: "+s.isMultiple());		
		List<WebElement> options = s.getOptions();		
		for (WebElement selOptions : options) {
			System.out.println(selOptions.getText());
		}
		
	}
	
}
