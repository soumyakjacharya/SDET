package com.vtiger.comcast.opportunitylib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOrg 
{

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		WebElement organizationslnk = driver.findElement(By.linkText("Organizations"));
		organizationslnk.getText();
		System.out.println(organizationslnk.getText());

     }
}
