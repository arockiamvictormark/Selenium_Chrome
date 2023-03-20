package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling_Single {
	
	public static void main(String[] args) throws Throwable  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.greenstechnologys.com/");
		
		Actions ac = new Actions(wd);
		
		WebElement mainmenu = wd.findElement(By.xpath("//a[text()='COURSES']"));
		ac.moveToElement(mainmenu).build().perform();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement findElement = wd.findElement(By.xpath("//span[text()='MSBI Training']"));
		ac.moveToElement(findElement).build().perform();
		WebElement submenu = wd.findElement(By.xpath("(//span[text()='Software Testing Training'])[1]"));
		ac.moveToElement(submenu).build().perform();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement subsubmenu = wd.findElement(By.xpath("(//span[text()='Selenium'])[2]"));
		ac.moveToElement(subsubmenu);
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ac.contextClick(subsubmenu).build().perform();
		
		Robot rt = new Robot();
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		String mainPage = wd.getWindowHandle();
		Set<String> tabs = wd.getWindowHandles();
		for (String tabCheck : tabs) {
			
			if (tabCheck.equals(mainPage)) {
				continue;
			} else {
				wd.switchTo().window(tabCheck);
			}
			
		}
		
		WebElement courseContent = wd.findElement(By.xpath("//i[contains(text(),'subtopics')]"));
		ac.moveToElement(courseContent);
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ac.contextClick(courseContent).build().perform();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> tabs2 = wd.getWindowHandles();
		for (String tabCheck2 : tabs2) {
			
			if (tabCheck2.equals(mainPage)) {
				continue;
			} else {
				wd.switchTo().window(tabCheck2);
			}
			
		}
		
		WebElement privacy = wd.findElement(By.xpath("//a[contains(@href,'Privacy')]"));
		ac.contextClick(privacy).build().perform();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> tabs3 = wd.getWindowHandles();
		for (String tabCheck3 : tabs3) {
			
			if (tabCheck3.equals(mainPage)) {
				continue;
			} else {
				wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				wd.switchTo().window(tabCheck3);
			}
			
		}
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wd.close();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wd.quit();
		System.out.println("*************************************************************EOC***");
		
	}

}
