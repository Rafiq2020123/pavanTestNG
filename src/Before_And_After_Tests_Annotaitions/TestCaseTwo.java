package Before_And_After_Tests_Annotaitions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCaseTwo {

	
	@AfterTest
	void logOut() {
		System.out.println("LogOut");
	}
	
	
	@Test (priority =1)
	void creatingPostTestCase2() {

		System.out.println("Creating a post 2 ");
	}

	@Test (priority =2)
	void findingFriedsTestCase2() {
		System.out.println("Finding friends 2 ");
	}

	@Test (priority =3)
	void scrollingDownTestCase2() {
		System.out.println("Scrolling down 3");
	}

	@Test (priority =4)
	void CreatingStoryTestCase2() {
		System.out.println("Creating a Story 3");
	}

	@Test (priority =5)
	void ClickingOnMarketPlace2() {
		System.out.println(" Clicking on Market Place 3");
}
	
}