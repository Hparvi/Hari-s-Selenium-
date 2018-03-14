package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15 
{

	public static void main(String[] args) throws Exception 
	{   
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
        //launching the site in browser
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(5000);
		List<WebElement>frs=driver.findElements(By.tagName("frame"));
		System.out.println(frs.size());
		for(WebElement fr:frs)
		{
			System.out.println(fr.getAttribute("name"));
		}
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		Thread.sleep(5000);
		String st=driver.switchTo().alert().getText();
		System.out.println(st);
		driver.switchTo().alert().accept();
	    Thread.sleep(5000);
		driver.close();

	}

}
