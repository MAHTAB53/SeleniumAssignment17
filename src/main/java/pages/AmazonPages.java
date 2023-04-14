package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPages {
	private static WebElement element = null;
 public static WebElement textbox_search(WebDriver driver) {
    element = driver.findElement(By.name("field-keywords"));
	return element;
}
     public static WebElement button_search(WebDriver driver) {
	 element = driver.findElement(By.id("nav-search-submit-button"));
    	 return element;
}
     public static WebElement deliver_to(WebDriver driver) {
	 element = driver.findElement(By.id("glow-ingress-line1"));
    	 return element;
}     
     public static WebElement delivery_pin(WebDriver driver) {
	 element = driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']"));
	 return element;
	 
}
     public static WebElement delivery_apply_btn(WebDriver driver) {
    	 element = driver.findElement(By.id("GLUXZipUpdate"));
    	 return element;
    	 
}
}
