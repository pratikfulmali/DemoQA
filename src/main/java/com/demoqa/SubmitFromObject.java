package com.demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmitFromObject {
	WebDriver driver;

	public SubmitFromObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[3]/h5")
	WebElement Elementclk;

	@FindBy(xpath = "(//span[@class='text'])[1]")
	WebElement TextBoxclk;

	@FindBy(xpath = "//input[@id='userName']")
	WebElement Fname;

	@FindBy(xpath = "//input[@placeholder='name@example.com']")
	WebElement Email;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement Caddrs;

	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	WebElement Paddrs;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitBtn;

	public void userData() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,350)");
		Elementclk.click();
		TextBoxclk.click();
		Fname.sendKeys("Salman");
		Email.sendKeys("salman.khan@gmail.com");
		Caddrs.sendKeys("Mumbai");
		Paddrs.sendKeys("New Mumbai");
		js.executeScript("window.scrollBy(0,350)");
		submitBtn.click();

	}

}
