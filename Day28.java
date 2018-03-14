package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day28
{

	public static void main(String[] args) throws Exception 
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// opening the site in browser
		driver.get("http://newtours.demoaut.com/");
		//maximize window 
		driver.manage().window().maximize();
		Thread.sleep(5000);	
		
	    //click method in javascriptExecutor
		
        WebElement e=driver.findElement(By.linkText("REGISTER"));
        
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", e);
		
		Thread.sleep(5000);	
		
		driver.close();
	}

}
