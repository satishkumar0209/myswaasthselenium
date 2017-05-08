package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Boookingsuccessful {
private static WebElement element;
	
	public static WebElement Details(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-bookingsuccess/div/div[4]/button[2]"));
		
		
	}

}
