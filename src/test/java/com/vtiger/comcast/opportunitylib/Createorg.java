package com.vtiger.comcast.opportunitylib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Createorg 
{
	public WebDriver diver;

	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public ExtentTest test;
	
	public void set()
	{
		reporter = new ExtentHtmlReporter("../SDET/ExtentReport/SDET.html");
		System.out.println("before suite excuted");
		reporter.config().setDocumentTitle("SDET");
		reporter.config().setTheme(Theme.STANDARD);	
		reports= new ExtentReports();
		reports.attachReporter(reporter);
			
	}
	 
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.getTitle();
		System.out.println("Title:"  +driver.getTitle());
		WebElement organizationslnk = driver.findElement(By.linkText("Organizations"));
		organizationslnk.getText();
		System.out.println(organizationslnk.getText());
		
	
	}	
	public void report()
	{
		reports.flush();
		System.out.println("---------DBclose-------");
		
		
	}
	
}
