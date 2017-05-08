package NormaluserPassenger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.FirstPassengersDetails;
import PageObjectModel.Firstpage;
import PageObjectModel.LoginPage;
import PageObjectModel.Makepayment;
import PageObjectModel.Normaluser;
import PageObjectModel.Passengerdetailspopup;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
public class Threepassenger2 {
	ATUTestRecorder recorder; 
	@Test
	public void passengers() throws InterruptedException, ATUTestRecorderException
	{
		    
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		
		 recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","ChangePassword-",false);
		 
			
			WebDriver driver=new ChromeDriver();
			 recorder.start(); 
		driver.get("http://staging.utair.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage.username(driver).sendKeys("satishkumar@innotical.com");
		LoginPage.Password(driver).sendKeys("14316925");
		LoginPage.Loginbutton(driver).click();
		Thread.sleep(2000);
		String actual="";
		String expected="";
		if(expected.equals(actual)){
	        System.out.println("Pass");
	    }
	        else {
	            System.out.println("Fail");
	        }
	
		Normaluser.Selectdatefield(driver).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Normaluser.Arrowofdatefield(driver).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Normaluser.Arrowofdatefield(driver).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Normaluser.Selectdate(driver).click();
		
		
		
		Normaluser.Selectpassengerfield(driver).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

		Normaluser.Three(driver).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Normaluser.SearchButton(driver).click();
		

}
	
}
