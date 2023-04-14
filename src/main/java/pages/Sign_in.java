package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_in {
	private static WebElement element = null;

    public static WebElement btn_hello(WebDriver driver) {
    element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	return element;
}
    
    public static WebElement btn_signOut(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"));
    	return element;
    }
    public static WebElement textbox_EmailOrPhone(WebDriver driver) {
    element = driver.findElement(By.xpath("//input[@id='ap_email']"));
	return element;
}
     public static WebElement btn_continue(WebDriver driver) {
    	 element = driver.findElement(By.xpath("//input[@id='continue']"));
    	 return element;
}
     public static WebElement textbox_Password(WebDriver driver) {
	 element = driver.findElement(By.name("password"));
    	 return element;//input[@id='signInSubmit']
}
     public static WebElement btn_signInSubmit(WebDriver driver) {
    	 element = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
    	 return element;
}
     public static WebElement btn_forgotPassword(WebDriver driver) {
    	 element = driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']"));
    	 return element;
}
     public static WebElement btn_ContinueforgotPassword(WebDriver driver) {
    	 element = driver.findElement(By.xpath("//input[@id='continue']"));
    	 return element;
}
     public static WebElement btn_CreateAccountSubmit(WebDriver driver) {
    	 element = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
    	 return element;
}
   
}
