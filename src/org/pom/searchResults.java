package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class searchResults {
	
	public searchResults(){
		
	}
	
	public searchResults(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Download")
	public WebElement lnkDownload;
	
	@FindBy(xpath = "//*[@id='header']/h1/a")
	public WebElement lnkHome;
	
	public void clickDownload(){
		lnkDownload.click();
		}
	
	public void clickHome(){
		lnkHome.click();
	}
}
