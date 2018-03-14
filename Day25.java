package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day25
{

	public static void main(String[] args) throws Exception
	{
		//opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    // opening the site in browser
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement w1=driver.findElement(By.id("draggable"));
		WebElement w2=driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		//drapAndDrang method in Actions class
		Actions a=new Actions(driver);
		a.dragAndDrop(w1, w2).build().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
