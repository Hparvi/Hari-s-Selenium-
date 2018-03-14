package sikuli;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Day40 {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\oxygen\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
	    Thread.sleep(5000);
		driver.manage().window().maximize();
		//screen shot of total page
	    Screen s=new Screen();
		ScreenImage si=s.capture();
		Thread.sleep(5000);
		BufferedImage bi=si.getImage();
		Thread.sleep(5000);
		File f=new File("C:\\Users\\lenovo\\Desktop\\umiar\\gmail.PNG");
		Thread.sleep(5000);
		ImageIO.write(bi,"PNG",f);
        Thread.sleep(5000);
		//Screenshot of Region of page
		Region r=new Region(100,200,300,400);
		Thread.sleep(5000);
		ScreenImage sri=s.capture(r);
		Thread.sleep(5000);
		BufferedImage bri=sri.getImage();
		Thread.sleep(5000);
		File f2=new File("C:\\Users\\lenovo\\Desktop\\umiar\\gmnailregion.PNG");
		Thread.sleep(5000);
		ImageIO.write(bri,"PNG",f2);
		Thread.sleep(5000);
		//type method
		s.type("C:\\Users\\lenovo\\Desktop\\umiar\\text.png","krhwfkoihgoi");
		Thread.sleep(5000);
		driver.close();

	}

}
