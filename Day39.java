package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Day39 
{

	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	Screen s= new Screen();
	s.click("C:\\Users\\lenovo\\Desktop\\e.PNG");
	Thread.sleep(5000);
	driver.close();
	}

}
