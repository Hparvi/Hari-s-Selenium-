package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day33 
{

	public static void main(String[] args) throws Exception
    {
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// opening the site in browser
		driver.navigate().to("http://site21.way2sms.com/content/index.html");
		Thread.sleep(5000);
		WebElement i=driver.findElement(By.id("username"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='harikrishna';",i);
		Thread.sleep(5000);
		driver.close();
		

	}

}
