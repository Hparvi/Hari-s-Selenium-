package webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16 
{

	public static void main(String[] args) 
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//launching the site in browser
		driver.manage().window().maximize();
	    //opening site in browser
	    driver.get("http://www.google.co.in");
	   // File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  //  File f2= new File(" path of file .PNG");
	    //FileUtils.copyFile(f1,f2);
	    driver.close();
	    

	}

}
