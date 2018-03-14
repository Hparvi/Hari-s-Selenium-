package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day27
{

	public static void main(String[] args) throws Exception 
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// opening the site in browser
		driver.get("https://accounts.google.com/SignUpWithoutGmail?hl=en");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("Hari");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("krishna");
		Thread.sleep(3000);
		driver.findElement(By.name("EmailAddress")).sendKeys("1234hari@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("1234@hari");
		Thread.sleep(3000);
		driver.findElement(By.id("PasswdAgain")).sendKeys("1234@hari");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		driver.findElement(By.xpath("//div[@role='listbox']")).sendKeys(Keys.DOWN,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("BirthDay")).sendKeys("15");
		Thread.sleep(3000);
		driver.findElement(By.id("BirthYear")).sendKeys("1988");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Gender']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Gender']")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9014456665");
		Thread.sleep(3000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tos-scroll")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.findElement(By.id("tos-scroll")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.findElement(By.id("tos-scroll")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.close();

	}

}
