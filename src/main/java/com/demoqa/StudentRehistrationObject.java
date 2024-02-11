package com.demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.Identified;

public class StudentRehistrationObject {
 WebDriver driver ;
 public StudentRehistrationObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
 }	
		@FindBy(xpath="(//div[@class='card-up'])[2]")
		WebElement form;
		
		
		@FindBy(xpath = "(//li[@class=\"btn btn-light \"])[10]")
		WebElement practiceform;
		
		@FindBy(xpath = "//input[@id='firstName']")
		WebElement fname;
		
		@FindBy(xpath = "//input[@id='lastName']")
		WebElement lname;
		
		@FindBy(xpath = "//input[@id='userEmail']")
		WebElement email;
		
		@FindBy(xpath = "//input[@value='Male']")
		WebElement gender;
		
		@FindBy(xpath = "//input[@id='userNumber']")
		WebElement umobile;
		
		@FindBy(xpath="//input[@id='dateOfBirthInput']")
		WebElement dob;
		
		@FindBy(xpath="//select[@class='react-datepicker__month-select']")
		WebElement selmonth;
		
		@FindBy(xpath="//select[@class='react-datepicker__year-select']")
		WebElement selyear;
		
		@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--015']")
		WebElement seldate;
		
		@FindBy(id = "subjectsInput")
		WebElement subject;
	
		@FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
		WebElement hobby;
		
		@FindBy(xpath = "//textarea[@id='currentAddress']")
		WebElement caddress;
			
		@FindBy(xpath = "(//div[@class=\" css-1hwfws3\"])[1]")
		WebElement selectstate;	
		
		@FindBy(xpath = "(//div[@class=\" css-1hwfws3\"])[2]")
		WebElement selectcity;	
		
		@FindBy(id="submit")
		WebElement subbutton;
		
		public void studentRegistration() throws InterruptedException {
			
			form.click();
			practiceform.click();
			fname.sendKeys("salman");
			lname.sendKeys("khan");
			email.sendKeys("salmankhan@123.beinghuman.com");
		//	Thread.sleep(3000);
		//	gender.click();
			
			Actions action =new Actions(driver);
			action.click(gender).build().perform();
			umobile.sendKeys("1234567890");
			dob.click();
			Select seldob=new Select(selmonth);
			seldob.selectByVisibleText("April");
			Thread.sleep(1000);
			Select selectyear=new Select(selyear);
			selectyear.selectByVisibleText("1975");
			Thread.sleep(1000);
			seldate.click();
			Thread.sleep(1000);
			subject.sendKeys("Hindi");
//			Thread.sleep(1000);
//			subject.sendKeys(Keys.ENTER);
//			subject.click();
//			subject.sendKeys("Hindi");
//			action.sendKeys(subject, "Hindi").click().build().perform();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			
			caddress.sendKeys("abc behind xyz building Mumbai");
			action.click(hobby).build().perform();
			
			
			
		}
		public void selectstateandCity() {
			
//			Select s= new Select(selectstate);
//			s.selectByIndex(1);
			selectstate.click();
			Actions actionState =new Actions(driver);
			actionState.sendKeys(selectstate, "NCR");
			
			Select s2 = new Select(selectcity);
			s2.selectByIndex(1);
			
			subbutton.click();
			
			
		}
		
		public void sucessfull() {
			System.out.println("This Test Run Sucessfully .....!!!1");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
