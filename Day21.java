package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day21 
{

	public static void main(String[] args) throws Exception 
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
	    // opening the site in browser
	    driver.get("http://www.flipkart.com");
	    Thread.sleep(5000);
	    
	    //maximize the window
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //locating element
	    WebElement w=driver.findElement(By.xpath("//span[text()='Women']"));
	    
	    //Action class
		Actions a=new Actions (driver);
		
	    //move to element method in Actions class
		a.moveToElement(w).build().perform();
		Thread.sleep(5000);
		driver.close();
	
	}

}
