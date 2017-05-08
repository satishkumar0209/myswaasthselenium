package PassengersTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.FirstPassengersDetails;
import PageObjectModel.Firstpage;
import PageObjectModel.LoginPage;
import PageObjectModel.Makepayment;
import PageObjectModel.Passengerdetailspopup;
import PageObjectModel.SecondPassengersDetails;

public class TwoPassengers {
	@Test
	public void passengers() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver (4)"); 
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage.username(driver).sendKeys("9014316925");
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
		Firstpage.SelectDate(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.SelectTimeField(driver).click();
		
		Firstpage.TimehoursUpperbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.Selectsecondsupperbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.PassengerField(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.PassengerTwo(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.Submit(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.BookOne(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		FirstPassengersDetails.Name(driver).sendKeys("satish kumar");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FirstPassengersDetails.Age(driver).sendKeys("25");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FirstPassengersDetails.Weight(driver).sendKeys("62");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		SecondPassengersDetails.Name(driver).sendKeys("Venkatesh");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SecondPassengersDetails.Age(driver).sendKeys("30");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SecondPassengersDetails.Weight(driver).sendKeys("80");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Makepayment.Makepayment(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Passengerdetailspopup.Proceedtopay(driver).click();
		

}
	

}
