package com.vtiger.comcast.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver){
	PageFactory.initElements(driver, this);
}
	@FindBy(name="user_name")
	private WebElement userNameEdt;
	@FindBy(name="user_password")
	private WebElement userPasswordEdt;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public WebElement getuserNameEdt() {
		return userNameEdt;
		
	}
	public WebElement getuserPasswordEdt() {
		return userPasswordEdt;
		
	}
	public WebElement getloginBtn() {
		return loginBtn;
	}
		public void loginToApp(String username, String Password) {
			userNameEdt.sendKeys(username);
		userPasswordEdt.sendKeys(Password);
		loginBtn.click();
		}
}
		
	
	
	