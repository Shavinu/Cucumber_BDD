package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Common_Steps {

	private WebDriver driver;
	

	@Before(order = 1)
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After(order = 1)
	public void tearDown() throws Exception
	{
		driver.quit();
		Thread.sleep(1000);
	}
	
	@Before(value = "@setCookies", order = 1)
	public void setCookies()
	{
		System.out.println("Scenario Specific Tag!!");
	}
		
	public WebDriver getDriver()
	{
		return driver;
	}
}
