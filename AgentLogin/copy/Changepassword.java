package AgentLogin.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.Editprofile;
import PageObjectModel.LoginPage;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Changepassword {
	ATUTestRecorder recorder; 
	@Test
	public void passengers() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		 recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","AgentChangePassword-",false);
		 
		
		WebDriver driver=new ChromeDriver();
		 recorder.start(); 
		driver.get("http://staging.utair.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		LoginPage.username(driver).sendKeys("satishkumar@innotical.com");
		LoginPage.Password(driver).sendKeys("14316925");
		LoginPage.Loginbutton(driver).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="";
		String expected="";
		
		if(expected.equals(actual)){
	        System.out.println("Pass");
	    }
	        else {
	            System.out.println("Fail");
	        }
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Editprofile.Editprofile(driver).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Editprofile.Editbutton(driver).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Editprofile.Edit(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Editprofile.OldPassword(driver).sendKeys("Password");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Editprofile.NewPassword(driver).sendKeys("14316925");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Editprofile.ConformPassword(driver).sendKeys("14316925");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Editprofile.Submitbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		LoginPage.lOGOUT(driver).click();
		driver.quit();
		recorder.stop();
		    }
	
}
