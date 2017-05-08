package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private static WebElement element;
	
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[ng-reflect-name='email']"));
			  
		
		//return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-login/div/div/div/div[2]/form/div[1]/input"));
		
	}

	
	public static WebElement Password(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[ng-reflect-name='password']"));
		
	}

	
	public static WebElement Loginbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-login/div/div/div/div[2]/form/div[3]/button"));
		
	}

	
	public static WebElement Forgotpassword(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/app-navbar/div[5]/app-login/div/div/div/div[2]/form/a"));
		
	}
	
	public static WebElement lOGOUT(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='LOGOUT']"));
		
	}

}
