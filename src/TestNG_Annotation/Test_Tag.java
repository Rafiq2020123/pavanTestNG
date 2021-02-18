package TestNG_Annotation;

import org.testng.annotations.Test;

public class Test_Tag {

	

	// Test case scenario

	// open the Facebook URL

	// Enter a valid username
	// Enter a valid password
	// Click on the login button

	
	
	@Test (priority =10)
	public void openFacebookUrl() {

		System.out.println("Open the Facebook Url");
	}

	@Test ( priority =11)
	public void enterValidUserName() {

		System.out.println("Enter a valid Usernamr");

	}

	@Test ( priority = 12)
	public void enterValidPassword() {

		System.out.println("Enter a valid password");

	}

	@Test ( priority = 13)
	public void clickOnTheLoginButton() {
		System.out.println("Click on the login button");
	}

}
