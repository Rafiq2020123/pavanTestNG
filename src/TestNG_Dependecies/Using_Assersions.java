package TestNG_Dependecies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_Assersions {

	
	@Test ( priority =11)
	public void enterValidUserName() {

		System.out.println("Enter a valid Usernamr");
         Assert.assertTrue(false); 
	}

	@Test ( priority = 12)
	public void enterValidPassword() {

		System.out.println("Enter a valid password");
        Assert.assertFalse(true);
	}
 
	@Test ( priority = 13)
	public void clickOnTheLoginButton() {
		System.out.println("Click on the login button");
	}

	
}
