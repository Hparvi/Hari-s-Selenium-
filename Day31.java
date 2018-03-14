package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day31 
{

	public static void main(String[] args) throws Exception 
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// opening the site in browser
		driver.get("http://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement g=driver.findElement(By.xpath(".//*[@id='example']/div[4]/div[1]/div[2]/div[4]/div[1]/div[11]/div/input"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", g);
		Thread.sleep(7000);
		driver.close();

	}

}
