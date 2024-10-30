package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	//Aim: Open chrome and goto
	//1.Google.co.in 2.Bing.com 3.Yahoo.com and close the browser
	
	WebDriver driver;//driver set as global variable
	long starttime;
	long endtime;
	
	
	@BeforeSuite
	public void launchBrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		driver.get("http://www.google.co.in");
		
	}
	@Test
	public void openBing() {
		
		driver.get("http://www.bing.com");
		
	}
	@Test
	public void openYahoo() {
		
		driver.get("http://www.yahoo.com");
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endtime = System.currentTimeMillis();
		Long totaltime = endtime - starttime;
		System.out.println("Timetaken" +totaltime);
	}
	

}
