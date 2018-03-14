package webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14 
{

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// launching the site 
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		
		//maximize the window 
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Find Elements Method
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int a= li.size();
        System.out.println(a);
		Thread.sleep(5000);
		driver.close();
		
	}

}
