package TestNG_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_And_After_Class_Annotations {

	
	// Before Class annotation is only used once and before all the methods  
	// After Class annotation is also  used once but After all the methods 
	
	@BeforeClass
	void login() {

		System.out.println("Login");
	}
	
@AfterClass
	void logOut() {
		System.out.println("LogOut");
	}

	@Test (priority =1)
	void creatingPost() {

		System.out.println("Creating a post");
	}

	@Test (priority =2)
	void findingFrieds() {
		System.out.println("Finding friends");
	}

	@Test (priority =3)
	void scrollingDown() {
		System.out.println("Scrolling down");
	}

	@Test (priority =4)
	void CreatingStory() {
		System.out.println("Creating a Story");
	}

	@Test (priority =5)
	void ClickingOnMarketPlace() {
		System.out.println(" Clicking on Market Place");
	}

}
