package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 
{

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		//find element method for locating web element
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		Thread.sleep(3000);
		//By method for identifying  the web element details
		driver.findElement(By.id("u_0_n")).sendKeys("hari");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("9014456665");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_c")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
