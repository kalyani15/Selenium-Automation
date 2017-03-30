package org.pom;
import java.util.concurrent.TimeUnit;

import org.DDT.ExcelLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainPage {

	public static void main(String[] args) throws InterruptedException {
		
		ExcelLib excel = new ExcelLib("F:\\data.xls");
		
		System.setProperty("webdriver.chrome.driver", "F:\\workspace\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.yahoo.com");
		
		//object for the page
		pageObjects page = new pageObjects(driver);
		page.googlSearch(excel.GetCellValue(0, 1));
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
