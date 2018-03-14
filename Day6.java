package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 
{

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    Thread.sleep(3000);
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		String a=driver.findElement(By.linkText("REGISTER")).getText();
		System.out.println(a);
		Thread.sleep(3000);
		driver.close();
	}

}
