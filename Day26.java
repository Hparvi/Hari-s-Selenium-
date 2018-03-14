package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day26 
{

	public static void main(String[] args) throws Exception
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    // opening the site in browser
		
		driver.navigate().to("http://jqueryui.com/slider/");
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(5000);
		
		WebElement fg=driver .findElement(By.id("slider"));
		Thread.sleep(5000);
		
		int c=fg.getLocation().getX();
		
		int i=fg.getLocation().getY();
		
		Actions jk=new Actions(driver);
		
		Thread.sleep(5000);
		//dragAndDropBy method in Actions class
		
		jk.dragAndDropBy(fg, c+50, i).build().perform();
		
		Thread.sleep(5000);
		
		jk.dragAndDropBy(fg, c-100, i).build().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
