package Reference;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class fb {
	ATUTestRecorder recorder;
	@Test
	public void passengers() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		 recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","selector-",false);
		  
		WebDriver driver=new ChromeDriver();
		 recorder.start();
		driver.get("");

recorder.stop();

}
