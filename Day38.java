package sikuli;

import org.sikuli.script.Screen;

public class Day38
{

	public static void main(String[] args) throws Exception 
	{
		Screen s =new Screen();
		Thread.sleep(3000);
          
		if(s.exists("C:\\Users\\lenovo\\Desktop\\sikuli\\b.PNG")!=null)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found ");
		}	

	}

}
