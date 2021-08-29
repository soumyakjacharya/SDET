package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{
	
	public static void main(String[] args)
	{

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com/");
		String parent =driver.getWindowHandle(); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		Set<String>s=driver.getWindowHandles();
		
		Iterator<String> I1=s.iterator();
		
		while(I1.hasNext())
				{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
				
			}
		}
		driver.switchTo().window(parent);
		
	}
}
