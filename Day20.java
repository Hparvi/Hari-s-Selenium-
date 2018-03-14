package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day20 
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
		 
		//locating element 
		 WebElement o=driver.findElement(By.name("q"));
		 
		 //Action Class 
		Actions v=new Actions(driver);
		
	    //Actions cache element
		v.click(o).build().perform();
		Thread.sleep(5000);
		v.sendKeys("flip").build().perform();
		Thread.sleep(5000);
	//	v.sendKeys(Keys.DOWN).build().perform();
	//	Thread.sleep(5000);
	//	v.sendKeys(Keys.ENTER).build().perform();
	//	Thread.sleep(5000);
	//	driver.close();
		Thread.sleep(5000);
        WebElement b = driver.findElement(By.xpath("//div[@id='sbse3']/div/b"));
        v.click(b).build().perform();
        driver.close();
        
	}

}
