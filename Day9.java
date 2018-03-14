package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9 
{

	public static void main(String[] args) throws Exception
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    Thread.sleep(3000);
	   //launching the site in browser
	    driver.get("http:www.way2sms.com");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.id("loginBTN")).click();
	    Thread.sleep(2000);
	    String a= driver.switchTo().alert().getText();
	    System.out.println(a);
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	   // driver.switchTo().alert().dismiss();
	   // driver.switchTo().alert().sendKeys("");
	    Thread.sleep(2000);
	    driver.close();
	}

}
