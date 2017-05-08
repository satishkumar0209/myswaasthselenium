package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Normaluser {
private static WebElement element;
	
	public static WebElement Selectdatefield(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-home/div[1]/div[2]/div/form/div/div[1]/p-calendar/span/input"));
		
	}
	public static WebElement Selectdate(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='stick']/div/form/div/div[1]/p-calendar/span/div/table/tbody/tr[5]/td[5]/a"));
		
	}
	public static WebElement Arrowofdatefield(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(".fa.fa-angle-right"));
		
	}
	public static WebElement Selectpassengerfield(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-home/div[1]/div[2]/div/form/div/div[2]/p-dropdown/div/label"));
		
	}
	public static WebElement Onepassenger(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='stick']/div/form/div/div[2]/p-dropdown/div/div[4]/div/ul/li[2]/span"));
		
	}
	public static WebElement Twopassenger(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='stick']/div/form/div/div[2]/p-dropdown/div/div[4]/div/ul/li[3]/span"));
		
	}
	public static WebElement Three(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='stick']/div/form/div/div[2]/p-dropdown/div/div[4]/div/ul/li[4]/span"));
		
	}
	
	public static WebElement Fourpassengers(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='stick']/div/form/div/div[2]/p-dropdown/div/div[4]/div/ul/li[5]/span"));
		
	}
	public static WebElement Fivepassengers(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='stick']/div/form/div/div[2]/p-dropdown/div/div[4]/div/ul/li[6]/span"));
		
	}
	public static WebElement SearchButton(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@id='stick']/div/form/div/div[3]/button[1]"));
	}
	public static WebElement Book1(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='BOOK NOW']"));
		
	}
	public static WebElement Book2(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement Book3(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement Book4(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
		
	}
	public static WebElement Date16(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-agentbooking/div/div[1]/form/div[1]/div[1]/p-calendar/span/div/table/tbody/tr[4]/td[1]/a"));
		
	}


}
