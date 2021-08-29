package com.vtiger.comcast.genericutility;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.vtiger.comcast.pomrepository.Home;
import com.vtiger.comcast.pomrepository.Login;


	public class BaseClass {
		public WebDriver driver;
		public static WebDriver sDriver;
		/*Object Creation for Lib*/
			public JavaUtility jLib = new JavaUtility();
			public WebDriverUtility wLib = new WebDriverUtility();
			public FileUtility fLib = new FileUtility();
			public ExcelUtility eLib = new ExcelUtility();
		
		@BeforeSuite
		public void configBS() {
			System.out.println("========================connect to DB========================");
		}
			
		@BeforeClass
		public void configBC() throws Throwable {
			System.out.println("=============Launch the Browser=======");
			driver = new ChromeDriver();
		    sDriver = driver;
			wLib.waitUntilPageLoad(driver);
			driver.manage().window().maximize();
			String URL = fLib.getPropertyKeyValue("url");
			//String BROWSER = fLib.getPropertyKeyValue("browser");
			driver.get(URL);
		}
		
		@BeforeMethod
		public void configBM() throws Throwable {
			/*common Data*/
			String USERNAME = fLib.getPropertyKeyValue("username");
			String PASSWORD = fLib.getPropertyKeyValue("password");
			
			/* Navigate to app*/
		
		/* step 1 : login */
		        Login loginPage = new Login(driver);
		loginPage.loginToApp(USERNAME, PASSWORD);
		}
		
		
		@AfterMethod
		public void configAM() {
		/*step 6 : logout*/
			Home homePage = new Home(driver);
	homePage.logout();
		}
		
		@AfterClass
		public void configAC() {
			System.out.println("=============Close the Browser=======");
			driver.quit();
		}
		
		@AfterSuite
		public void configAS() {
			System.out.println("========================close DB========================");
		}
	}
