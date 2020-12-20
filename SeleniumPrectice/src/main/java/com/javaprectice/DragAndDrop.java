package com.javaprectice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Droppable")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);

		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));

		a.dragAndDrop(from, to).build().perform();
		//ScreenShort.Screens(driver, "raj");

		driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Resizable")).click();
		ScreenShort.Screens(driver, "Test");// for screeshot we call screenshot class
		driver.close();
//driver.navigate().refresh();
	}

}
