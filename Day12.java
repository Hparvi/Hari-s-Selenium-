package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day12 
{

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    //launching the site in browser
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement a=driver.findElement(By.id("day"));
		Select s= new Select(a);
		s.selectByIndex(2);
		Thread.sleep(5000);
		s.selectByVisibleText("13");
		Thread.sleep(5000);
		s.selectByValue("5");
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
