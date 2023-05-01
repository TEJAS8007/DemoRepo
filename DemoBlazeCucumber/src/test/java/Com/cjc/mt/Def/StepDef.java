package Com.cjc.mt.Def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	static WebDriver driver;
	
	@Given("^User Should Navigate To DemoBlaze.com$")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\ChromeDriver 112\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.demoblaze.com/index.html");
		 
		 driver.manage().window().maximize();
	}
	
	@When("^click On the signup button$")
	public void clickonsignup() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
		Thread.sleep(2000);
	}
	
	@And("^send The username value as \"(.*)\"$")
	public void uid(String u)
	{
		driver.findElement(By.id("sign-username")).sendKeys(u);
	}
	
	@And("^send the password value as \"(.*)\"$")
	public void pass(String p)
	{
		driver.findElement(By.id("sign-password")).sendKeys(p);
	}
	
	@And("^Click On the Signup button$")
	public void signup() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	@Then("^Sign up Action Should Be Successfull$")
	public void success()
	{
		System.out.println("Sign Up Success");
	}
	
	
	@Given("^User Should Sign up Successfully$")
	public void succesfullSignup()
	{
		System.out.println("Sign Up Should Be Successful");
	}
	
	@And("^click on the Login button$")
	public void clickonLogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		Thread.sleep(2000);
	}
	
	@And("^user loguser send the value as \"(.*)\"$")
	public void uid1(String ui)  
	{
		driver.findElement(By.id("loginusername")).sendKeys(ui);
		
	}
	
	@And("^user logpass send the value as \"(.*)\"$")
	public void uipass(String ps) 
	{
		driver.findElement(By.id("loginpassword")).sendKeys(ps);
		
	}
	
	@And("^Click on the login button$")
	public void loginbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
	}
	@Then("^Login action Should be Succesfull$")
	public void succesfulllogin()
	{
		System.out.println("Successfull Login");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
