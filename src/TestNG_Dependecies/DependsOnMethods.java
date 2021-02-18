package TestNG_Dependecies;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependsOnMethods {

	
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
		Assert.assertFalse(true);
	}
	// We can make a test case depended to one another by using the below annotation:
	@Test (priority =2,dependsOnMethods = "creatingPost")
	void findingFrieds() {
		System.out.println("Finding friends");
	}

	@Test (priority = 3,dependsOnMethods = "findingFrieds" )
	void scrollingDown() {
		System.out.println("Scrolling down");
	}

	@Test (priority =4,dependsOnMethods ="scrollingDown")
	void CreatingStory() {
		System.out.println("Creating a Story");
	}

	// We can make a test case disabled by using the below annotation 
	
	@Test (priority =5,enabled =false)
	void ClickingOnMarketPlace() {
		System.out.println(" Clicking on Market Place");
	}

}
