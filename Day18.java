package webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18 
{

	public static void main(String[] args) throws Exception 
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    // opening the site in browser
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//maximize window 
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> a=driver.findElements(By.tagName("input"));
		System.out.println(a.size());
		Thread.sleep(5000);
		driver.close();

	}

}
