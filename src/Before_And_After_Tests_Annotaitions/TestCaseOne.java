package Before_And_After_Tests_Annotaitions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseOne {

	@BeforeTest
	void login() {

		System.out.println("Login");
	}
	
	@Test (priority =1)
	void creatingPostTestCase1() {

		System.out.println("Creating a post 1");
	}

	@Test (priority =2)
	void findingFriedsTestCase1() {
		System.out.println("Finding friends 1");
	}

	@Test (priority =3)
	void scrollingDownTestCase1() {
		System.out.println("Scrolling down 1");
	}

	@Test (priority =4)
	void CreatingStoryTestCase1() {
		System.out.println("Creating a Story 1");
	}

	@Test (priority =5)
	void ClickingOnMarketPlace1() {
		System.out.println(" Clicking on Market Place 1");
}
	
	
}