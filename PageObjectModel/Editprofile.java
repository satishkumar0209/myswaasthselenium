package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Editprofile{
private static WebElement element;
	
	public static WebElement Editprofile(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='My Account']"));
		
	}

	public static WebElement Editbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("	"));
	}
	public static WebElement Edit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='EDIT']"));
		
	}
	public static WebElement OldPassword(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[ng-reflect-name='oldPassword']"));
		
	}
	public static WebElement NewPassword(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[ng-reflect-name='newPassword']"));
		
	}
	public static WebElement ConformPassword(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[ng-reflect-options='[object Object]']"));
		
	}
	public static WebElement Submitbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='SAVE']"));
		
	}

}
