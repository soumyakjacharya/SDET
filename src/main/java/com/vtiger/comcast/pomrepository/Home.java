package com.vtiger.comcast.pomrepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	public Home(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Opportunities") 
	private WebElement OpportunitiesLnk;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG\']")
	private WebElement AdministatorImg;
	
	@FindBy(linkText="Sign Out") 
	private WebElement SignOutLnk;
	
	@FindBy(linkText="Create Filter")
	private WebElement Create_Filter;
	
	public WebElement getOpportunitiesLnk() {
		return OpportunitiesLnk;
	}

	public WebElement getAdministatorImgLnk() {
		return AdministatorImg;
	}

	public WebElement getSignOutLnk() {
		return SignOutLnk;
	}

  public WebElement getCreateFilter() {
	    return Create_Filter;}
	
	public void logout() {
		Actions act=new Actions(driver);
		act.moveToElement(AdministatorImg).perform();
		SignOutLnk.click();
	}
}
