package AgentLogin.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Mobilenumberlogin {
	ATUTestRecorder recorder;
	@Test
	public void passengers() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		 recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","MobileLogin-",false);
		 recorder.start();  
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		LoginPage.username(driver).sendKeys("7065996703");
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
