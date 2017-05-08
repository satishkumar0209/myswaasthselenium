package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Firstpage {
private static WebElement element;
	
	public static WebElement dateField(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[1]/form/div[1]/div[1]/p-calendar/span"));
		
	}
	
	public static WebElement Arrowofdatefield(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(".fa.fa-angle-right"));
		
	}
	public static WebElement Selectdate(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[1]/form/div[1]/div[1]/p-calendar/span/div/table/tbody/tr[3]/td[7]/a"));
		
	}
	
	public static WebElement PassengerField(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[1]/form/div[2]/div[2]/p-dropdown/div/label"));
		
	}
	public static WebElement PassengerOne(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[1]/form/div[2]/div[2]/p-dropdown/div/div[4]/div/ul/li[2]"));
		
	}
	public static WebElement PassengerTwo(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement PassengerThree(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement PassengerFour(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement PassengerFive(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement Submit(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement BookOne(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement BookTwo(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement BookThree(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement BookFour(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement BookFive(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement BookSix(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	
	public static WebElement check(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Check']"));
		
	}
	public static WebElement Date16(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[1]/form/div[1]/div[1]/p-calendar/span/div/table/tbody/tr[4]/td[1]/a"));
		
	}
	

}
