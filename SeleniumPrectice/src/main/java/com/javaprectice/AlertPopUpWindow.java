package com.javaprectice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://nppes.cms.hhs.gov/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'ACCEPT')]")).click();
		// Thread.sleep(5000);
		// System.out.println(driver.switchTo().alert().getText());
		// get the text from pop up
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		// accept method for accept ,ok
		// dismiss method for decline, dismiss, cross.

	}
}
