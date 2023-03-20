package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		WebElement celldata = wd.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
		System.out.println("celldata: "+celldata.getText());
		
		List<WebElement> alldata = wd.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td"));
		for (WebElement alldatas : alldata) {
			System.out.println("alldatas: "+alldatas.getText());
		}
		
	}

}
