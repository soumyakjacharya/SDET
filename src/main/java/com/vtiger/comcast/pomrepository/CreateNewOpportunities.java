package com.vtiger.comcast.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOpportunities {
		WebDriver driver;
		public CreateNewOpportunities(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);

}
@FindBy(name="potentialname")
private WebElement OppNameEdt;

@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
private WebElement RelatePlusImg;

@FindBy(name="search_text")
private WebElement seachTextbox;

@FindBy(name="search")
public WebElement clicksearchBtn;

@FindBy(linkText="HPLAPTOP")
public WebElement SelectName;

@FindBy(name="button")
private WebElement SaveBtn;

@FindBy(name="viewName")
private WebElement viewname;

@FindBy(name="button2")
private WebElement saveBtn2;

@FindBy(xpath="[@class='crmbutton small cancel']")
private WebElement cancelBtn;

@FindBy(linkText="Edit")
private WebElement EdiLnk;

public void createOpp(String oppName) {
	OppNameEdt.sendKeys(oppName);
	
}
public WebElement getRelatePlusImg() {
	return RelatePlusImg;
}
public void searchText(String name) {
	seachTextbox.sendKeys(name);
	
}
public WebElement getclicksearchBtn() {
	return clicksearchBtn;
}
public WebElement getSelectName() {
	return SelectName;
}
	public WebElement getSaveBtn() {
		return SaveBtn;
}
	public WebElement getSaveBtn2() {
		return saveBtn2;
}

	public WebElement getcancelBtn() {
		return cancelBtn;
	}
	
	public void getviewname(String name) {
		viewname.sendKeys(name);
	}
	public WebElement getEditLnk() {
		return EdiLnk;
	}
	}
	