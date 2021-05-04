package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept2 {
	@Test(invocationCount = 10)
	public void homePageSearchTest() {
		System.out.println("Home Page Search Test");
	}
	
	
	
	

}
