package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Makepayment {
private static WebElement element;
	
	public static WebElement Makepayment(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='MAKE PAYMENT']"));
		
	}

}
