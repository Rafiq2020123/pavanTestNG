package PageObjectStuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {

	
WebDriver driver;
	
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver", "C://Users//ringo//Downloads//All Selenium Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	void userRegistration()
	{
		RegistrationPage object=new RegistrationPage(driver);
		object.clickRegLink();
		object.setFirstName("Rafiq");
		object.setLastName("Noori");
		object.setPhone("8142402254");
		object.setemail("123@gmail.com");
		object.setAddress1("Maryland");
		object.setAddress2("Herat");
		object.setCity("CollegPark");
		object.setState("MD");
		object.setPostalCode("20740");
		object.setCountry("USA");
		object.setUserName("Ringo");
		object.setPassword("20201");
		object.setConfirmedPassword("20201");
		object.clickRegBtn();
		
		// Validation

		/*if (ChromeDriver.getPageSource().contains("Thank you for registering")) {
					Assert.assertTrue(true);
		}

		else {
				Assert.fail();
			}*/
	}
}
