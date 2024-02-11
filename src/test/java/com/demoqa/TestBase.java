package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	WebDriver driver;
	@BeforeSuite
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
	
	}
	
	
	@AfterSuite
	public void TearDown() {
//		driver.quit();
	}
	

}
