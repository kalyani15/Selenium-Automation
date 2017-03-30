package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjects {

	
	public pageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "p")
	public WebElement txtSearch;
	
	@FindBy(id = "UHSearchWeb")
	public WebElement btnSearch;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	public WebElement searchLink;
	
	public void googlSearch(String searchText){
		
		txtSearch.sendKeys(searchText);
		btnSearch.click();
		}

	public searchResults seleniumClick(){
		
		searchLink.click();
		return new searchResults();
		}
	
	
	
}
