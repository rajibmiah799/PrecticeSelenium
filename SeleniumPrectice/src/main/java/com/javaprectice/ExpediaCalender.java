package com.javaprectice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String month = "Aug 2020";

		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
		driver.findElement(By.xpath("//label[@id='flight-type-roundtrip-label-hp-flight']")).click();
		driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"))
				.sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");
		driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).sendKeys("London (LHR-Heathrow)");
		driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']")).click();

		while (true) {
			String mon = driver.findElement(By.xpath("(//caption[@class='datepicker-cal-month-header'])[1]")).getText();

			if (mon.equals(month)) {
				break;
			} else {
				driver.findElement(
						By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']"))
						.click();

				Thread.sleep(2000);
			}
			driver.findElement(
					By.xpath("(//div[@class='datepicker-cal-month']//table//tbody//tr[2]//td[2]//button)[1]")).click();

		}
		driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).click();

		while (true) {
			String month2 = "Oct 2020";
			String mon = driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText();
			if (mon.equals(month2)) {
				break;
			} else {
				driver.findElement(
						By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']"))
						.click();
				Thread.sleep(1000);
			} // end if
			driver.findElement(By.xpath("(//button[contains(@class,'datepicker-cal-date')])[59]")).click();

		} // end while

	}
}
