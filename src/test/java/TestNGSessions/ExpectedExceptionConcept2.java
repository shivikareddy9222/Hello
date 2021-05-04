package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept2 {
	int age = 10;
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void a_test() {
		System.out.println(" A Test ");
		int i = 9/0;
		ExpectedExceptionConcept2 obj = new ExpectedExceptionConcept2();
		obj = null;
		System.out.println(obj.age);
	}
	/*@Test()
	public void atest() {
		System.out.println(" A Test ");
		int i = 9/0;
	}*/
	
	
	
	
	

}
