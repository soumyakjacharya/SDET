package com.vtiger.comcast.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesInfo {
	WebDriver driver;
	public OpportunitiesInfo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement SuccessfulMsg;
	public WebElement getSuccessfulMsg() {
		return SuccessfulMsg;
	}
		
}
