package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPassengersDetails {
private static WebElement element;
	
	public static WebElement Name(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/input"));
		
	}
	public static WebElement Agefield(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/p-dropdown/div/label"));
		
	}

	public static WebElement Age(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/p-dropdown/div/div[4]/div/ul/li[4]"));
		
	}

	public static WebElement Genderinputfield(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}

	public static WebElement Male(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}

	public static WebElement Female(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	
	public static WebElement Weight(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='weight0']"));
		
	}
	
	
	

}
