package RunTestCasesLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.Helper;
import PageObjectModel.LoginPage;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Login {
	ATUTestRecorder recorder;
	@Test
	public void passengers() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		 recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Login-",false);
		  
		WebDriver driver=new ChromeDriver();
		 recorder.start();
		driver.get("http://staging.utair.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		LoginPage.username(driver).sendKeys("satishkumar@innotical.com");
		LoginPage.Password(driver).sendKeys("Password");
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
		LoginPage.lOGOUT(driver).click();
		driver.quit();
		recorder.stop();
		
}
}
