package datadriven;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class Excel 
{

	public static void main(String[] args) throws Exception 
	{
		//open file for reading
		File f=new File("C:\\Users\\lenovo\\Desktop\\way2sms.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		//count number f rows used
		int cour=rsh.getRows();
		
		//open same excel file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//Data driven testing
		int c=rsh.getColumns();
		for(int i=1;i<cour;i++)
		{		
		String m=rsh.getCell(0,i).getContents();
		String mc=rsh.getCell(1,i).getContents();
		String p=rsh.getCell(2,i).getContents();
		String pc=rsh.getCell(3,i).getContents();
		//launch site
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\selenium Training\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("http://site21.way2sms.com/content/index.html");
		
		driver.findElement(By.id("username")).sendKeys(m);
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(p);
		
		driver.findElement(By.xpath(".//*[@value='Login']")).click();
		
		Thread.sleep(5000);
		//testing
		try
		{		
		 if(m.equals("")&&ExpectedConditions.alertIsPresent()!=null)
		 {
		   Label l=new Label(c,i,"Test Pased");
		   wsh.addCell(l); 
		 }
		 else if(m.length()<10&&ExpectedConditions.alertIsPresent()!=null)
		 {
			Label l5=new Label(c,i,"Test Passed");
			wsh.addCell(l5);
		}
		 else if(mc.equals("invalid")&&driver.findElement(By.xpath("//*[contains(text(),'registered yet')]")).isDisplayed())
		 {
			Label l2=new Label(c,i,"Test Passed");
			wsh.addCell(l2);
		}
		 else if(p.equals("")&&ExpectedConditions.alertIsPresent()!=null)
		 {
			 Label l3=new Label(c,i,"Test Passed");
		   	 wsh.addCell(l3);
		}
		else if(mc.equals("valid")&&pc.equals("invalid")&&driver.findElement(By.xpath("html/body/div[3]")).isDisplayed())
		{
		    Label l4=new Label(c,i,"Test Passed");
			wsh.addCell(l4);
		}
		else if(mc.equals("valid")&&pc.equals("valid")&&driver.findElement(By.xpath("//*[@id='w2scapt']")).isDisplayed())
		{
			Label l6=new Label(c,i,"Test Passed");
			wsh.addCell(l6);
		}
		else
		{
		    Label l8=new Label(c,i,"Login failed");
			wsh.addCell(l8);
		}
		}
		catch(Exception e)
		{
			Label l7=new Label(c,i,"Exception was raised");
			wsh.addCell(l7);
		}
		driver.close();
		}
		wwb.write();
		wwb.close();
		rwb.close();

	}

}
