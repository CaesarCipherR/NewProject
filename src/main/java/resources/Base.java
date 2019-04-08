package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initializeDriver() throws IOException {
		
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Mariana\\Login\\src\\main\\java\\data.properties");
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browserName.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if (browserName.equals("IE"))
	{
		//IE code
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;
	}
	
	public void getScreenshot(String result, WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Mariana\\test\\"+result+"screenshot.png"));
	}

}
