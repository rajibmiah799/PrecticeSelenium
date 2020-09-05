package com.javaprectice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSearch {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("american");
		List<WebElement> li = driver.findElements(By.xpath("//input[@class='gLFyf gsfi']"));

		for (int i = 0; i < li.size(); i++) {
			// String s = li.get(i).getText();
			if (li.get(i).getText().contentEquals("American Express")) {
				li.get(i).click();
			}// end of if
			// System.out.println(s);

		}// end of for
	}// end of main

}// end of class
