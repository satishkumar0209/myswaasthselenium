package PassengersTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.Booking;
import PageObjectModel.Boookingsuccessful;
import PageObjectModel.FirstPassengersDetails;
import PageObjectModel.Firstpage;
import PageObjectModel.LoginPage;
import PageObjectModel.Makepayment;
import PageObjectModel.Passengerdetailspopup;
public class Onepassenger {
	@Test
	public void passengers() throws InterruptedException
	{
		    
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://staging.utair.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage.username(driver).sendKeys("ssatishkumar@innotical.com");
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
	
		Firstpage.dateField(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.Arrowofdatefield(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.Arrowofdatefield(driver).click();
		Firstpage.Arrowofdatefield(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.Date16(driver).click();
		
		try
		 
		{
			
			
	 
			
		}catch(Exception e){
	 
			
	 
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.PassengerField(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.PassengerOne(driver).click();
		
		
		
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.check(driver).click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FirstPassengersDetails.Name(driver).sendKeys("satish");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FirstPassengersDetails.Agefield(driver).click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FirstPassengersDetails.Age(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FirstPassengersDetails.Weight(driver).sendKeys("23");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Makepayment.Makepayment(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Passengerdetailspopup.Proceedtopay(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Boookingsuccessful.Details(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Booking.Details(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Booking.cancel(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Booking.cancelbooking(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Booking.Checkbox(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Booking.cancelbutton(driver).click();
		
		Booking.yes(driver).click();
		

}
	
}
