package com.vtiger.comcast.opportunitylib;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vtiger.comcast.genericutility.ExcelUtility;
import com.vtiger.comcast.genericutility.FileUtility;
import com.vtiger.comcast.genericutility.JavaUtility;
import com.vtiger.comcast.genericutility.WebDriverUtility;
import com.vtiger.comcast.pomrepository.Login;

public class GetTitle1 {
public WebDriver driver;
public JavaUtility JLib =new JavaUtility();
public WebDriverUtility WLib = new WebDriverUtility();
public FileUtility FLib= new FileUtility();
public ExcelUtility ELib =new ExcelUtility();

public ExtentHtmlReporter reporter;
public ExtentReports reports;
public ExtentTest test;

@BeforeSuite
public void configBS() {
	reporter =new ExtentHtmlReporter("../SDET/ExtentReport/SDET.html");
	System.out.println("before suite excuted");
	reporter.config().setDocumentTitle("SDET");
	reporter.config().setTheme(Theme.STANDARD);	
	reports= new ExtentReports();
	reports.attachReporter(reporter);
	
	System.out.println("-----connect to DB---------");
}
@BeforeClass
public void configBM() throws Throwable
{
	driver =new ChromeDriver();
	WLib.waitUntilPageLoad(driver);
	driver.manage().window().maximize();
    String url =FLib.getPropertyKeyValue("url");
	String username =FLib.getPropertyKeyValue("usrername");
	String password =FLib.getPropertyKeyValue("password");
	driver.get(url);
	Login loginpage =new Login(driver);
	loginpage.loginToApp(username,password);
}
@BeforeMethod
	public void ConfigBC() 
	{
		System.out.println("--------LANCH BROWSER-----");
		
		
		
	}
// home page i need to create  public void ConfigAM() 
@AfterMethod
public void configAS()
{
	reports.flush();
	System.out.println("-----close Db------");
	
}

@Test
public void HomeText() {
	test= reports.createTest("HomeText");
	Login loginpage =new Login(driver);
	driver.findElement(By.linkText("Home")).getText();
	
	driver.findElement(By.linkText("Home"));
	String ExpectedText ="Home";
	String ActualText =driver.findElement(By.linkText("Home")).getText();
	if(ActualText.equals(ExpectedText))
	{
		System.out.println("pass:"+ActualText+"dispalyed");
	}
	else
	{
		System.out.println("fail:"+ActualText+"not displayed");
	}
	
}

		
}
