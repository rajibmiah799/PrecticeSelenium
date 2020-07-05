package com.javaprectice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovarPrectice {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// List always import from util packege
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("total link " + li.size());// syso to see how many link there

		WebElement from = driver.findElement(By.id("nav-link-accountList"));

		WebElement to = driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(from).moveToElement(to).click().build().perform();

	}

}
