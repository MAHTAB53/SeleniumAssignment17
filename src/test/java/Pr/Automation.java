package Pr;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.AmazonPages;
import pages.DeliveryLocation;
import pages.MainSearchBar;
import pages.ReturnOrder;
import pages.Sign_in;

public class Automation {

    public static  File file ;
    public static WebDriver driver = null;
    static Properties prop= new Properties();
    public static String browser = "chrome";
    static FileInputStream fis =null;
    
    static {
    	try {
    		file =new File("./config.properties");
    		fis =new FileInputStream(file);
    	}
    	catch(FileNotFoundException e) {
    		e.printStackTrace();
    	}
    	try {
    		
			prop.load(fis);
    	}
    	catch(IOException e) {
    		e.printStackTrace(); 
    	}
    }
	
	  @BeforeTest
	public void beforeTestInitializeWebdriver() {
	        System.out.println("This will execute before the Test");
	     
			if(browser.equals("chrome")) {
	     		WebDriverManager.chromedriver().setup();  
			    driver = new ChromeDriver(); //make a chrome driver obj.
	     	}
			else if(browser.equals("msedge")) {
				WebDriverManager.edgedriver().setup();
			    driver = new EdgeDriver(); //make a edge driver obj.
			}
			else if(browser.equals("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();//make a firefox driver obj.
			}  
		}

	 @Test(priority=1)
	 public void test() throws Exception {
		     String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		     driver.get(prop.getProperty("Url"));//test1//this will open the url
		     String amazonTitle = driver.getTitle();
		     System.out.println("This is the Testcase1"+ amazonTitle);
		     Assert.assertEquals(amazonTitle, expectedTitle);
		 

		     driver.manage().window().maximize();//test2
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.manage().window().maximize();
		
		     


//Positive Sign_in test cases:=============================
			//Create account window opening............
		     Sign_in.btn_hello(driver).click();
		     Sign_in.btn_CreateAccountSubmit(driver).click();
		     driver.navigate().back();
	         driver.navigate().back();
	         
	       //forgot password.................
		     Sign_in.btn_hello(driver).click();
		     Sign_in.textbox_EmailOrPhone(driver).sendKeys(prop.getProperty("EmailOrPhone"));
		     Sign_in.btn_continue(driver).click();
		     Sign_in.btn_forgotPassword(driver).click();
		     //Sign_in.btn_ContinueforgotPassword(driver).click();
		     driver.navigate().back();
		     driver.navigate().back();
		     driver.navigate().back();
		     
		     
//LoginAccount========================
		     
		     Sign_in.btn_hello(driver).click();
		     Sign_in.textbox_EmailOrPhone(driver).sendKeys(prop.getProperty("EmailOrPhone"));
		     Sign_in.btn_continue(driver).click();
		     Sign_in.textbox_Password(driver).sendKeys(prop.getProperty("Password"));
		     Sign_in.btn_signInSubmit(driver).click();
		     driver.navigate().back();
		     driver.navigate().back();
		     driver.navigate().back();
		      


//return order test case:=============================	     
		     ReturnOrder.returnOrder_Btn(driver).click();
		     driver.navigate().back();		   
		     
//return order test case:=============================			     
		     MainSearchBar.textbox_search(driver).sendKeys(prop.getProperty("TextSearch"));//test3
		     MainSearchBar.button_search(driver).click();//test4

//failed  test case:=============================	 
		     Sign_in.btn_hello(driver).click();
			 Sign_in.btn_continue(driver).click();
			 driver.navigate().back();
	}
	 
	 @Test(priority=2)
	 public void test2() throws Exception{

	          DeliveryLocation.deliver_to(driver).click();
	          DeliveryLocation.delivery_pin(driver).sendKeys(prop.getProperty("deliverPinCode"));
	          DeliveryLocation.delivery_apply_btn(driver).click();
	 }

	 
	  @AfterTest
	  public void afterTestBrowserClose() {
	          System.out.println("This will execute after the Test browser close");
			  driver.quit();
		}
	  
}
