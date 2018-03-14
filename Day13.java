package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13
{

	public static void main(String[] args) throws Exception 
	{
	// opening the browser 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	// launching the site 
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	Thread.sleep(5000);
	//maximize the window 
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//getting frames into list
	List<WebElement>frs=driver.findElements(By.tagName("frame"));
	System.out.println(frs.size());
	Thread.sleep(5000);
	for(WebElement fr:frs)
	{
		System.out.println(fr.getAttribute("name"));
	}
	Thread.sleep(5000);
	//entering into first frames 
	driver.switchTo().frame(0);
	Thread.sleep(5000);
	//locating the element
	driver.findElement(By.xpath("//img[@alt='continue']")).click();
	Thread.sleep(5000);
	//getting the text from alert
	String st=driver.switchTo().alert().getText();
	Thread.sleep(5000);
	//printing the alert text
	System.out.println(st);
	Thread.sleep(5000);
	//accepting the alert
	driver.switchTo().alert().accept();
	Thread.sleep(5000);

	//locating the element 
	driver.findElement(By.name("fldLoginUserId")).sendKeys("123456");
	Thread.sleep(5000);
	driver.close();
	}

}
