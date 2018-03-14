package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day29 
{

	public static void main(String[] args) throws Exception 
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// opening the site in browser
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		WebElement f=driver.findElement(By.name("userName"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('disabled','');",f);
		Thread.sleep(5000);	
		js.executeScript("arguments[0].removeAttribute('disabled');",f);
		Thread.sleep(5000);	
		driver.close();

	}

}
