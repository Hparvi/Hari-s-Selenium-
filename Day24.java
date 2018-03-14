package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day24 
{

	public static void main(String[] args) throws Exception 
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// opening the site in browser
		driver.navigate().to("http://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//element locating 
		WebElement e1=driver.findElement(By.xpath("//*[contains(@class,'dropdown selection multiple')]"));
		//Action class
		
		Actions b=new Actions(driver);
		Thread.sleep(5000);
		
		b.click(e1).build().perform();
		Thread.sleep(5000);
		
		b.sendKeys("J", Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		b.sendKeys("a", Keys.ENTER).build().perform();
		Thread.sleep(5000);
		 Webelement c= driver.findElement(By.xpath(""))
		
		driver.close();
		
	}

}
