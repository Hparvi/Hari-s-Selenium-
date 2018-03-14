package webdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11 
{

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    //launching the site in browser
		driver.get("http://www.naukri.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/ul/li[3]/a/div")).click();
		Thread.sleep(5000);
		ArrayList<String> b=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(b.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(b.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(b.get(2));
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
				
	}

}
