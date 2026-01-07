package org.TestPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	
	@BeforeClass
	@Parameters({"browser", "UR"})
	public void setUp(@Optional("Firefox")String browser1, String URL1) {
		System.out.println("Browser: "+browser1);
		System.out.println("AUT Link: "+ URL1);
		
	}
	
	@Test
	public void test() {
				

	}

}
