package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	public By signin = By.id("email");
	public By password = By.id("pass");
	public By login = By.id("u_0_2");
	public By title = By.cssSelector(".mbs._3ma._6n._6s._6v");
	public By NavBar = By.cssSelector("._6a._6b.product_desc");
	
	public WebElement getLogIn() {
		
		return driver.findElement(signin);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
    public WebElement getNavBar() {
    	return driver.findElement(NavBar);
    }
}
