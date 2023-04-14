package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnOrder {


	private static WebElement element = null;
	

     public static WebElement returnOrder_Btn(WebDriver driver) {
	 element = driver.findElement(By.xpath("//a[@id='nav-orders']"));
    	 return element;
}

}
