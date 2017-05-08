package PassengersTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.FirstPassengersDetails;
import PageObjectModel.Firstpage;
import PageObjectModel.FivePassengersDetails;
import PageObjectModel.FourthPassengersDetails;
import PageObjectModel.LoginPage;
import PageObjectModel.Makepayment;
import PageObjectModel.Passengerdetailspopup;
import PageObjectModel.SecondPassengersDetails;
import PageObjectModel.ThirdPassengersDetails;

public class FivePassengers {
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
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.TimehoursUpperbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.Selectsecondsupperbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.PassengerField(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firstpage.PassengerFive(driver).click();
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
		ThirdPassengersDetails.Name(driver).sendKeys("Srimannarayana");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ThirdPassengersDetails.Age(driver).sendKeys("55");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ThirdPassengersDetails.Weight(driver).sendKeys("90");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FourthPassengersDetails.Name(driver).sendKeys("Suseela");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FourthPassengersDetails.Age(driver).sendKeys("50");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FourthPassengersDetails.Weight(driver).sendKeys("90");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FourthPassengersDetails.Genderinputfield(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FourthPassengersDetails.Female(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		FivePassengersDetails.Name(driver).sendKeys("Vani");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FivePassengersDetails.Age(driver).sendKeys("29");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FivePassengersDetails.Weight(driver).sendKeys("70");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FivePassengersDetails.Genderinputfield(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FivePassengersDetails.Female(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		Makepayment.Makepayment(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Passengerdetailspopup.Proceedtopay(driver).click();
}

}