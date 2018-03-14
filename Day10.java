package webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10 
{

	public static void main(String[] args) throws Exception
    {

		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    Thread.sleep(3000);
	    //launching the site in browser
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("http://site21.way2sms.com/content/index.html?");
		//clicking on image link 
		driver.findElement(By.xpath("//*[@id='Login']/div/div/a/img")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	/*	// taking window handles into array list
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(0));
		Thread.sleep(5000);
		//going to 1st tab
	    driver.switchTo().window(a.get(1));
	    Thread.sleep(5000);
	    driver.close();*/
	
		
		
	}

	}


