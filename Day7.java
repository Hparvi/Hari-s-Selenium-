package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 
{

	public static void main(String[] args) throws Exception 
	{
		// opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    Thread.sleep(3000);
	    driver.get("http://www.gmail.com");
	    Thread.sleep(3000);
	    //maximize the window 
	    driver.manage().window().maximize();
	    
	    
	   //get size
	    
	  	int w=driver.manage().window().getSize().getWidth();
	  	int h=driver.manage().window().getSize().getHeight();
	  	System.out.println(w+" "+h);
	  	Thread.sleep(5000);
	  	
	  	//set size
	  	Dimension d=new Dimension( 300,300);
	  	driver.manage().window().setSize(d);
	  	Thread.sleep(5000);
	  	
	  	//get position
	  	int x=driver.manage().window().getPosition().getX();
	  	int y=driver.manage().window().getPosition().getY();
	  	System.out.println(x+" "+y);
	  	Thread.sleep(5000);
	  	//set position
	  	Point p=new Point(300,200);
	  	driver.manage().window().setPosition(p);
	  	Thread.sleep(5000);
	  	driver.close();
	  	

	}

}
