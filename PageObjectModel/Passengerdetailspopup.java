package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Passengerdetailspopup {
private static WebElement element;
	
	public static WebElement Proceedtopay(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[4]/div/div[2]/button[1]"));
		
	}

	public static WebElement modify(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}

}
