package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling_Multiple {
	
	public static void robotKeyPress() throws Throwable {
		Robot rt = new Robot();
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.greenstechnologys.com/");
		
		Actions ac = new Actions(wd);
		
		WebElement tab1 = wd.findElement(By.xpath("//a[text()='Certifications']"));
		ac.contextClick(tab1).build().perform();		
		robotKeyPress();
		
		WebElement tab2 = wd.findElement(By.xpath("//a[text()='Online Courses']"));
		ac.contextClick(tab2).build().perform();		
		robotKeyPress();
		
		WebElement tab3 = wd.findElement(By.xpath("//a[text()='CONTACT US']"));
		ac.contextClick(tab3).build().perform();		
		robotKeyPress();
		
		WebElement tab4 = wd.findElement(By.xpath("//a[text()='HOSTEL']"));
		ac.contextClick(tab4).build().perform();		
		robotKeyPress();
		
		String s = "http://www.greenstechnologys.com/contact.php";
		Set<String> all_Tabs = wd.getWindowHandles();
		
		for (String tabCheck : all_Tabs) {
			if(wd.switchTo().window(tabCheck).getCurrentUrl().equals(s)) {
				break;
			}
		}
		
	}

}
