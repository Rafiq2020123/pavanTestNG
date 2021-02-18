package TestNG_Annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_And_After_Methods_Annotations {

	@BeforeMethod
	void login() {

		System.out.println("Login");
	}
	
@AfterMethod
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
