import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Operation 
{
	Scanner sc=new Scanner(System.in);
	
   public void choose()
   {
	   Operation op=new Operation();
	   System.out.println("1: Chrome");
	   System.out.println("2: fireFox");
	   System.out.println("Enter you choice");
	   int choice=sc.nextInt();
	   switch(choice)
	   {
	   case 1:
         op.chrome();
         break;
	   case 2:
		   op.firefox();
		   break;
	   }
   }
   public void chrome()
   {
	  
	   System.setProperty("webdriver.chrome.driver", "F:\\Rejava\\SeleniumFinalProject\\chromedriver.exe");   
	   WebDriver driver=new ChromeDriver();
	   try {
	   driver.get("https://www.google.com");
	   driver.manage().window().maximize();
	   }
	   catch (Exception e)
	   {
		System.out.println(e);
	   }
	   finally
	   {
		  // driver.close();
	   }
   }
   public void firefox()
   {
	   System.setProperty("webdriver.gecko.driver", "F:\\Rejava\\SeleniumFinalProject\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		try {
       driver.get("https://www.google.com");
       driver.manage().window().maximize();
		}
		catch (Exception e) 
		{
		  System.out.println(e);
		}
		finally
		{
			//driver.close();
		}
   }
}
