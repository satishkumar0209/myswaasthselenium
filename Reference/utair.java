package Reference;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class utair {
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

		
		
List allDates=driver.findElements(By.xpath("//table[@class='ui-state-default']//td"));		//

		LoginPage.username(driver).sendKeys("agent@gmail.com");
		LoginPage.Password(driver).sendKeys("11111");
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
	driver.findElement(By.xpath("")).click();
	Thread.sleep(5000);
	

}
}
