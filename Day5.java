package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		String a=driver.getTitle();
		System.out.println(a);
		Thread.sleep(3000);
		String d=driver.getCurrentUrl();
		System.out.println(d);
		Thread.sleep(3000);
		String b=driver.getPageSource();
		System.out.println(b);
		Thread.sleep(3000);
		String c=driver.findElement(By.id("identifierId")).getAttribute("data-initial-dir");
		System.out.println(c);
		Thread.sleep(3000);
		driver.close();
		

	}

}
