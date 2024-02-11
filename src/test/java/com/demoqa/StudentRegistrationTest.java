package com.demoqa;

import org.testng.annotations.Test;

public class StudentRegistrationTest extends TestBase {
	@Test
	public void studentformdetails() throws InterruptedException {
		StudentRehistrationObject srb= new StudentRehistrationObject(driver);
		
		srb.studentRegistration();
		srb.selectstateandCity();
		srb.sucessfull();
		
	}
	

}
