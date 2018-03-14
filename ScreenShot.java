package webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    //launching the site in browser
		driver.get("http://www.naukri.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		// Screenshot 
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(5000);
		File f2 = new File ("C:\\Users\\lenovo\\Desktop\\ScreenShot\\1.PNG");
		Thread.sleep(5000);
		Files.copy(f1,f2); //FileUtils.copyFile(f1,f2)
		Thread.sleep(5000);
		driver.close();

	}

}
