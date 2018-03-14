package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute 
{

	public static void main(String[] args) throws InterruptedException
	{
		    // opening the browser 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			// launching the site 
		    driver.get("http://www.google.com");
			//maximize the window 
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement a= driver.findElement(By.linkText("Gmail"));
			Thread.sleep(3000);
			String Str= a.getAttribute("class");
			Thread.sleep(3000);
			System.out.println(Str);
			Thread.sleep(3000);
			driver.close();
			
	}

}
