package com.vtiger.comcast.opportunitylib;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.pomrepository.CreateNewOpportunities;
import com.vtiger.comcast.pomrepository.Home;
import com.vtiger.comcast.pomrepository.Login;
import com.vtiger.comcast.pomrepository.OpportunitiesInfo;
import com.vtiger.comcast.pomrepository.Opportunities;

public class CreateOpprtunityCancelBtn {
@Test
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
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
		Thread.sleep(5000);
		
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
		Thread.sleep(3000);
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
		Home opp=new Home(driver);
				opp.getOpportunitiesLnk().click();
				opp.getCreateFilter().click();
				cno.getSaveBtn2().click();
				cno.getviewname("soumya");
		        cno.getcancelBtn().click();
		       }
	

}