package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    Thread.sleep(3000);
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
			System.out.println("site is secruable ");
		}
		else
		{
			System.out.println("site is not secruable ");
		}
		driver.close();
	}

}
