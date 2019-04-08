package Project;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class HomePageTest extends Base{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void basePageNavigation() throws IOException {
	

		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "Sign Up");
		Assert.assertTrue(lp.getNavBar().isDisplayed());
		lp.getLogIn().sendKeys("email@hotmail.com");
		lp.getPassword().sendKeys("1234");
		lp.login().click();
		
	}
	
   @AfterTest
   public void teardown() {
	   driver.close();
   }
	
}
