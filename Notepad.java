package datadriven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notepad 
{

	public static void main(String[] args) throws Exception
	{
		// open for text file for data reading
		File f1= new File("C:\\Users\\lenovo\\Desktop\\s.txt");
		FileReader fr =new FileReader(f1);
		BufferedReader br= new BufferedReader(fr);
				
		// open text file for result writing 
		
		File f2= new File("C:\\Users\\lenovo\\Desktop\\s1.txt");
		FileWriter fw= new FileWriter(f2);
		BufferedWriter bw= new BufferedWriter(fw);
				
		 //data driven testing 
		
		String l;
		
	    while((l=br.readLine())!=null) 
		{
		String[]P=l.split(",");
					 
	    //launch the site 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\selenium Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// enter user id 
		driver.findElement(By.name("identifier")).sendKeys(P[0],Keys.ENTER);
		Thread.sleep(5000);
		// user id testing 
		if(P[1].equals("valid")&&driver.findElement(By.name("password")).isDisplayed())
		{
		 bw.write("user id test was passed");
		 bw.newLine();
		 
		// enter password
		driver.findElement(By.name("password")).sendKeys(P[2],Keys.ENTER);
		Thread.sleep(5000);
					
	    // password testing 	
		if(P[3].equals("valid")&&driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
	    {
		bw.write("password test was passed ");
		bw.newLine();
		}
		else if(P[3].equals("invalid")&& driver.findElement(By.xpath("//div[contains(text(),'Wrong password. Try ag') or contains(text(),'Enter a password')]")).isDisplayed())
		{
		bw.write("password test was failed");
		bw.newLine();
		}
		else
		{
		bw.write("password test was passed");
		bw.newLine();
		}
		}
		else if(P[1].equals("invalid")&& driver.findElement(By.xpath("//div[@jsname='B34EJ']")).isDisplayed())
		{
		bw.write("user id test was passed");
		bw.newLine();
		}
		else
		{
		bw.write("user id test was failed ");
		bw.newLine();	
		}
		driver.close();
	    }
					
	    //save the files
		br.close();
	    fr.close();
		bw.close();
		fw.close();

	}

}
