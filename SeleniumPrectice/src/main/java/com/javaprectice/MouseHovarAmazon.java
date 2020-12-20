package com.javaprectice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHovarAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Dimension d = new Dimension(1000, 1000);
		driver.manage().window().setSize(d);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		WebElement from = driver.findElement(By.id("nav-link-accountList"));
		WebElement to = driver.findElement(By.xpath("//span[contains(text(),'Find a Gift')]"));
		Thread.sleep(2000);
		ac.moveToElement(from).moveToElement(to).click().build().perform();
	}

}
