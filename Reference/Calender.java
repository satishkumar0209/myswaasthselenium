package Reference;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;

public class Calender {
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		// recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","selector-",false);
		  
		WebDriver driver=new ChromeDriver();
		// recorder.start();
 
		driver.get("https://www.makemytrip.com/flights?cmp=SEM%7cD%7cDF%7cG%7cBrand%7cB_M_Makemytrip_Search_Exact%7cBrand_Top_5_Exact%7c93065448728&s_kwcid=AL!1631!3!93065448728!e!!g!!mmt&ef_id=WPm7cwAABJUcxwul%3A20170421075739%3As");
		driver.findElement(By.id("hp-widget__depart")).click();
		
		//driver.findElement(By.id("dp1492761460650")).click();
					
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='multiCityDate1 hasDatepicker']"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("30"))
			{
				ele.click();
				break;
			}
			
		}
		
	}
}



