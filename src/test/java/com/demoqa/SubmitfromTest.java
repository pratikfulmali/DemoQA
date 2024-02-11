package com.demoqa;

import org.testng.annotations.Test;

public class SubmitfromTest extends TestBase {

	
	@Test
	public void UserDatasub() {
		
		
		SubmitFromObject sfo = new SubmitFromObject(driver);
		sfo.userData();
	}
	
}
