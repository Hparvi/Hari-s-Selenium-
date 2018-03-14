package robotkeys;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day37 
{

	public static void main(String[] args) throws Exception 
	{
		//launch a Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    // to open site in browser
		driver.get("https://www.google.com/gmail");
		Thread.sleep(5000); 
		driver.findElement(By.id("identifierId")).sendKeys("krish0134");
		driver.findElement(By.className("RveJvd")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("bujjikrish786");
		driver.findElement(By.className("RveJvd")).click();
		Thread.sleep(5000);
		//click compose 
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		Thread.sleep(5000);
		//fill fields 
		driver.findElement(By.name("to")).sendKeys("krish0134@Hotmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("subjectbox")).sendKeys(" welcome to automation ");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("This is the test messages from automation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-tooltip='Attach files']/descendant::*[3]")).click();
		Thread.sleep(5000);
		// handle file upload window using java robot
		Robot r = new Robot();
		StringSelection x= new StringSelection("C:\\Users\\lenovo\\Desktop\\sivanna.docx ");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//sending mail
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		//logout the mail 
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		// closing the browser
	   driver.close();
	}

}
