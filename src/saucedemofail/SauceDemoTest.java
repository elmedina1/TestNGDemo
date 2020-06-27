package saucedemofail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SauceDemoTest {
public WebDriver driver;


@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//executable//chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	
	public void getUrl() {
		
		String curUrl = driver.getCurrentUrl();
		Assert.assertEquals(curUrl, "https://www.saucedemo.co21m/","Incorrect url");
		
	}
	
	@AfterMethod
	public void getScreenshotOnMetFail(ITestResult result) {
		
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			String destination =System.getProperty("user.dir")+"//screenshot//"+result.getName()+".png";
			
			try {
				FileUtils.copyFile(source, new File(destination));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
