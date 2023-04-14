package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DeliveryLocation {


	private static WebElement element = null;

     public static WebElement deliver_to(WebDriver driver) {
	 element = driver.findElement(By.id("glow-ingress-line1"));
	 //element = driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
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
