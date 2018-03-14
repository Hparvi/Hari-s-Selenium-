package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day17 
{

	public static void main(String[] args) throws Exception 
	{    
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
           
		//opening site in browser
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		
		//maximize window 
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	    // navigate method operations
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(5000);
		
		driver.navigate().back();//google
		Thread.sleep(5000);
		
		driver.navigate().forward();//facebook
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();//facebook
		Thread.sleep(5000);
		
		driver.close();
	}

}
