package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Booking {
private static WebElement element;
	
	public static WebElement Details(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-myaccount/div/div[2]/app-bookings/div[2]/div[1]/div/div[5]/div/button"));
		
		
	}
	
	public static WebElement cancelbooking(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-myaccount/div/div[2]/app-bookingdetail/div/div[2]/a[2]"));
		
		                                   
	}
	public static WebElement Checkbox(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-myaccount/div/div[2]/app-bookingdetail/div/div[3]/div[1]/div/div[1]/div[2]/div[1]/p-checkbox/div/div[2]"));
		
		                                   
	}
	public static WebElement cancelbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-myaccount/div/div[2]/app-bookingdetail/div/div[3]/div[1]/div/div[3]/button[2]"));
		
		                                   
	}
	
	
	public static WebElement yes(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-myaccount/div/div[2]/app-bookingdetail/div/div[5]/button"));
		
		                                   
	}
}
