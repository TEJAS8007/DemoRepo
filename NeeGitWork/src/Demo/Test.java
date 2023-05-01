package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Hello GitHub");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\ChromeDriver 112\\chromedriver_win32\\chromedriver.exe");
	    
		      WebDriver driver=new ChromeDriver();
		      
		      driver.get("https://www.youtube.com/");
		      
		     driver.manage().window().maximize();
		     
		   String value=driver.findElement(By.xpath("//*[@id=\"logo-icon\"]")).getCssValue("colour");
	   
		     System.out.println(value);
		     
		     Test test=new Test();
		       test.m1();
		     
	      }
	
	
	   public void m1()
	   {
		   System.out.println("Addition");
		    int a=10;
		    int b=20;
		    int c=a+b;
		    System.out.println(c);
	   }
	
	
	
	
	
	
	
	
}
