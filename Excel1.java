package datadriven;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel1 
{

	public static void main(String[] args) throws Exception
   {
		//open file for reading
		File f=new File("C:\\Users\\lenovo\\Desktop\\2.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);		
		//count number of rows used
		int nour=rsh.getRows();		
		int nouc=rsh.getColumns();		
		//open same excel file for writing		
	    WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);		
		//Data driven testing		
		for(int i=1;i<nour;i++)
		{
		String u=rsh.getCell(0,i).getContents();
		String uc=rsh.getCell(1,i).getContents();
	    String p=" ";
		String pc=" ";		
		if(uc.equals("valid"))
		{
			p=rsh.getCell(2,i).getContents();
			pc=rsh.getCell(3,i).getContents();
		}
		// launch site 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\selenium Training\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://www.gmail.com");
	    driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys(u,Keys.ENTER);
		Thread.sleep(5000);
		// user id testing 
		 if(uc.equals("valid")&&driver.findElement(By.name("password")).isDisplayed())
		 {
		    Label L1=new Label (nouc,i,"user id test was passed");
		    wsh.addCell(L1);
		    driver.findElement(By.name("password")).sendKeys(p,Keys.ENTER);
		  Thread.sleep(5000);
		 //password testing 
		  if(pc.equals("valid")&&driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
		  {
		    Label L2=new Label (nouc,i,"password test was passed");
		      wsh.addCell(L2); 
		  }
		   else if(pc.equals("invalid")&&driver.findElement(By.xpath("//div[contains(text(),'Wrong password. Try ag') or contains(text(),'Enter a password')]")).isDisplayed())
		  {
		   Label L3=new Label (nouc,i,"password test was passed");
		   wsh.addCell(L3); 
		   }
		    else
		  {
		   Label L4=new Label (nouc,i," password test was passed");
		   wsh.addCell(L4); 
		    }
		    }
		   // user id testing
		  else if(uc.equals("invalid")&&driver.findElement(By.xpath("//div[@jsname='B34EJ']")).isDisplayed())
		 {
		 Label L5=new Label (nouc,i,"user id test was passed");
		  wsh.addCell(L5);
		 }
		  else
		 {
		   Label L6=new Label (nouc,i,"user id test was passed");
		   wsh.addCell(L6);
    	   }
		 // closing browser 
		  driver.close();
		     }
		  // closing the excel file 
		wwb.write();
		wwb.close();
		rwb.close();
	}

}
