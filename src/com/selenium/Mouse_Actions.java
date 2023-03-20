package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Workspace\\Sample\\Selenium_Chrome\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.greenstechnologys.com/");
		
		Actions ac=new Actions(wd);
		
//		WebElement certiClick = wd.findElement(By.xpath("//a[text()='Certifications']"));
//		ac.click(certiClick).build().perform();
//		wd.navigate().back();
//		WebElement rightClick = wd.findElement(By.xpath("//a[text()=' Privacy Policy']"));
//		ac.contextClick(rightClick).build().perform();
//		Thread.sleep(3000);
//		WebElement textRightClick = wd.findElement(By.xpath("//u[contains(text(),'Greens Technologys Software')]"));
//		ac.doubleClick(textRightClick).build().perform();
//		Thread.sleep(3000);
//		WebElement clickHold = wd.findElement(By.xpath("//img[contains(@alt,'Facebook')]"));
//		ac.clickAndHold(clickHold).build().perform();
//		System.out.println("================================================================>Holding Facebook");
//		Thread.sleep(13000);
//		WebElement onlineMove = wd.findElement(By.xpath("//a[text()='Online Courses']"));
//		ac.moveToElement(onlineMove).build().perform();
		wd.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		Thread.sleep(3000);
		WebElement hold = wd.findElement(By.xpath("//li[@name='C']"));
		ac.clickAndHold(hold).build().perform();
		Thread.sleep(9000);
		System.out.println("================================================================>The End");
		
	}

}
