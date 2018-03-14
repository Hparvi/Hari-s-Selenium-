package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        Thread.sleep(3000);
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("hari");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("krishna");
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("9014456665");
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("kandraharikrishna@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("ogur village");
		Thread.sleep(3000);
		driver.findElement(By.name("address2")).sendKeys("kandukur mandal");
		Thread.sleep(3000);
		driver.findElement(By.name("city")).sendKeys("kandukur");
		Thread.sleep(3000);
		driver.findElement(By.name("state")).sendKeys("AndhraPradesh");
		Thread.sleep(3000);
		driver.findElement(By.name("postalCode")).sendKeys("523105");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("krish0134");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		Thread.sleep(3000);
		driver.close();

	}

}
