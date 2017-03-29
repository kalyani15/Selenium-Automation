package org.pom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F://workspace//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		//object for the page
		pageObjects page = new pageObjects(driver);
		page.googlSearch("Selenium - Web Browser Automation");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		searchResults seleniumPage = page.seleniumClick();
		
		//Wait for the page to load
		Thread.sleep(500);
		
		//Object for searchResults
		seleniumPage = new searchResults(driver);
		seleniumPage.clickDownload();
		seleniumPage.clickHome();
		
		
		
		
	}

}
