package com.javaprectice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElementPrectice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// list java interface
		// <> call generic
		// we import List from java util
		List<WebElement> l = driver.findElements(By.xpath("//ul[contains(@id,'header-nav-bar')]//li"));
		for (int i = 0; i < l.size(); i++) {
			String s = l.get(i).getText();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//ul[contains(@id,'header-nav-bar')]//li[5]")).click();
			// conect parent to child

			System.out.println(s);

		}

		// System.out.println("Total size is "+ l.size());
		// driver.close();

	}// end main

}// end class
