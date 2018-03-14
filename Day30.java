package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day30 
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
		// page scrolling in javascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);	
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);	
		driver.close();

	}

}
