package Com.cjc.DemoWe.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStep {
  
	static  WebDriver driver;
	
	@Given("^User Shuold Navigate To DemowebShop Website$")
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\ChromeDriver 112\\chromedriver_win32\\chromedriver.exe");
	     
		  driver=new ChromeDriver();
		  
		  driver.get("https://demowebshop.tricentis.com/register");
		  
		  driver.manage().window().maximize();
    }
	
	@When("^click on gender Button$")
	public void clickOnGender()
	{
		driver.findElement(By.name("Gender")).click();
	}
	
	@And("^send First Name As \"(.*)\"$")
	public void FirstName(String fn)
	{
		driver.findElement(By.name("FirstName")).sendKeys(fn);
	}
	
	@And("^Send Last name As \"(.*)\"$")
	public void lasname(String ln)
	{
		driver.findElement(By.name("LastName")).sendKeys(ln);
	}
	
	@And("^Use email as \"(.*)\"$")
	public void enterEmail(String em)
	{
		driver.findElement(By.name("Email")).sendKeys(em);
	}
	
	@And("use PassWord as \"(.*)\"")
	public void pass(String ps)
	{
		driver.findElement(By.name("Password")).sendKeys(ps);
	}
	
	@And("Confirm PassWord \"(.*)\"")
	public void ConPass(String ps1)
	{
		driver.findElement(By.name("ConfirmPassword")).sendKeys(ps1);
	}
	
	@And("^click on the Register Button$")
	public void register()
	{
		driver.findElement(By.name("register-button")).click();
	}
	
	@Then("^Login Should be Success$")
	public void Success()
	{
		System.out.println("Login Success");
	}
	
	@Given("^User Should Register Successfully$")
	public void SuccessRegister()
	{
		System.out.println("User Register Successfully");
	}
	
	@When("^Click on Continue Button$")
	public void clickonContinue() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
	}
	
	@Given("^User Should have Clicked On Continue Button$")
	public void acontinue()
	{
		System.out.println("Add To Cart");
	}
	@When("^click on any Product$")
	public void clickOnProduct()
	{
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[1]/a/img")).click();
	}
	
	@And("^Add To cart product$")
	public void addtocart()
	{
		driver.findElement(By.id("add-to-cart-button-31")).click();
	}
	
	@And("^View Cart$")
	public void viewcart()
	{
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
	}
	
	@And("^Click on checkbox$")
	public void clickoncheck()
	{
	  driver.findElement(By.id("termsofservice")).click();
	}
	
    @And("^Click on CheckOut$")
    public void clickoncheckout()
    {
    	driver.findElement(By.id("checkout")).click();
    }

    @Then("^user should chekout Sucessfull$")
    public void successChekout()
    {
    	System.out.println("Suceesfull Checkout");
    }

    @Given("^User Should have Checkout SuccessFully$")
    public void detailsCheckout()
    {
    	System.out.println("After The Suceessfull Checkout");
    }
    
//    @When("^ User Should Send FirstName As \"(.*)\"$")
//    public void sendFirstName(String fn) throws InterruptedException
//    {
//    	Thread.sleep(1000);
//    	driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys(fn);
//    }
//    
//    @And("^User Should Send last Name as \"(.*)\"$")
//    public void lastName(String ln)
//    {
//    	driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys(ln);
//    }
//    
//    @And("^user should send Email as \"(.*)\"$")
//    public void email(String em)
//    {
//    	driver.findElement(By.id("BillingNewAddress_Email")).sendKeys(em);
//    }
    
    @And("^user should send Company name as \"(.*)\"$")
    public void comp(String co)
    {
    	driver.findElement(By.id("BillingNewAddress_Company")).sendKeys(co);
    }
    
    @And("^User Should Select Country$")
    public void country()
    {
       WebElement country=driver.findElement(By.id("BillingNewAddress_CountryId"));
              Select sel=new Select(country);
               sel.selectByIndex(39);
    }
    
    @And("^User Should select state$")
    public void state()
    {
       WebElement state=driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
              Select sel=new Select(state);
               sel.selectByIndex(0);
    }
    
    
    @And("^user shoud send City as \"(.*)\"$")
    public void city(String ci)
    {
    	driver.findElement(By.id("BillingNewAddress_City")).sendKeys(ci);
    }
    
    @And("User Should send Address1 as \"(.*)\"$")
    public void address(String ad1)
    {
    	driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys(ad1);
    }
    
    @And("User should Send Address2 as \"(.*)\"$")
    public void addresssecond(String ad2)
    {
    	driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys(ad2);
    }
    
    @And("^user should send zip/postal code as \"(.*)\"$")
    public void zip(String zp)
    {
    	driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys(zp);
    }
    
    @And("^user Should send phone Number as \"(.*)\"$")
    public void phoneNumber(String ph)
    {
    	driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(ph);
    }
    
    @And("^User Should send Fax Number as \"(.*)\"$")
    public void faxNumber(String fh)
    {
    	driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys(fh);
    }
    
    @And("^User click on Continue Button$")
    public void formContinue() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
    	Thread.sleep(2000);
    }
    
    @And("^User click on Continue Button1$")
    public void firstContinueAfterForm() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
    	Thread.sleep(2000);
    }
    
    @And("^User click on Continue Button2$")
    public void SecondContinueAfterForm() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
    	Thread.sleep(2000);
    }
    
    @And("^User click on Continue Button3$")
    public void ThirdContinueAfterForm() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
    	Thread.sleep(2000);
    }
    
    @And("^User click on Continue Button4$")
    public void FourthContinueButtonAfterForm() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
    	Thread.sleep(2000);
    }
    
    @And("^User click on Continue Button5$")
    public void FifthContinueButtonAfterForm() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
    	Thread.sleep(2000);
    }
    
    @Then("^User Shoud View Thankyou Massage$")
    public void Complete()
    {
    	System.out.println("Complete Massage");
    }
    
    
    
    
    
    
    
    
    
    
    





}
