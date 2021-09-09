package com.vtiger.comcast.opportunitylib;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericutility.BaseClass;
import com.vtiger.comcast.pomrepository.CreateNewOpportunities;
import com.vtiger.comcast.pomrepository.Home;
import com.vtiger.comcast.pomrepository.Login;
import com.vtiger.comcast.pomrepository.OpportunitiesInfo;
import com.vtiger.comcast.pomrepository.Opportunities;
@Listeners(com.vtiger.comcast.genericutility.ListnerImp.class)
public class CreateOpportunitiesTest extends BaseClass{
@Test
	public void CreateOpportunities (){
	
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		
		Login loginpage = new Login(driver);
		loginpage.loginToApp("admin", "admin");
		
		
		Home homepage = new Home(driver);
		homepage.getOpportunitiesLnk().click();
	
		Opportunities oppourtinitypage = new Opportunities(driver);
		oppourtinitypage.getCreateOppImg().click();
		
		CreateNewOpportunities cno = new CreateNewOpportunities(driver);
		String Createoppourtinityurl = driver.getCurrentUrl();
		String parentId = driver.getWindowHandle();
		cno.createOpp("abc");
		cno.getRelatePlusImg().click();
		
		
		Set<String> allid = driver.getWindowHandles();
		for(String wid:allid) {
			System.out.println(driver.getTitle());
			if(!(wid.equals(parentId))) {
				driver.switchTo().window(wid);
				break;
			}
		}
		
		driver.switchTo().activeElement();
		cno.searchText("HPLAPTOP");
		cno.getclicksearchBtn().click();
		cno.getSelectName().click();

		driver.switchTo().window(parentId);
		cno.getSaveBtn().click();
		
		OpportunitiesInfo oppourtinityinfo = new OpportunitiesInfo(driver);
		String actsuccesfullmsg = oppourtinityinfo.getSuccessfulMsg().getText();
		CharSequence oppname = "abc";
		if(actsuccesfullmsg .contains(oppname)) {
			System.out.println(oppname +" == Created successfully");
		}else {
			System.out.println(oppname + " ==== not created successfully");
		}
		Home signout=new Home(driver);
				signout.logout();
	}
	

}