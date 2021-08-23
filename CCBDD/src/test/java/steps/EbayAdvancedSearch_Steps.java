package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps {
	
	Common_Actions common_actions;
	EbayAdvancedSearch_Actions ebayadvancedsearch_actions;
	
	public EbayAdvancedSearch_Steps(Common_Actions common_actions, EbayAdvancedSearch_Actions ebayadvancedsearch_actions)
	{
		this.common_actions = common_actions;
		this.ebayadvancedsearch_actions = ebayadvancedsearch_actions;
	}
	
	@Given("I am Ebay Advanced Search Page")
	public void i_am_Ebay_Advanced_Search_Page() {
		//driver.get("https://www.ebay.com/sch/ebayadvsearch");
		common_actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
	}

	@When("I click on Ebay logo")
	public void i_click_on_Ebay_logo() {
		//driver.findElement(By.xpath("//td[@class='gh-td']")).click();
		ebayadvancedsearch_actions.clickOnEbayLogo();
	}

	@Then("I am navigted to Ebay Home Page")
	public void i_am_navigted_to_Ebay_Home_Page() {
		String expURL = "https://www.ebay.com/";
		//String curURL = driver.getCurrentUrl();
		String curURL = common_actions.getCurrentPageUrl();
		if(!expURL.equals(curURL))
		{
			fail("Page does not navigated to expected page");
		}
		common_actions.quitWebDriver();
	}
	
	@When("I advanced search an item")
	public void i_advanced_search_an_item(DataTable dataTable) throws Exception {
		//driver.findElement(By.cssSelector("#_nkw")).sendKeys(dataTable.cell(1, 0));
		ebayadvancedsearch_actions.enterSearchString(dataTable.cell(1, 0));
		//driver.findElement(By.id("_ex_kw")).sendKeys(dataTable.cell(1, 1));
		ebayadvancedsearch_actions.enterExcludeString(dataTable.cell(1, 1));
		//driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1, 2));
		ebayadvancedsearch_actions.enterMinPrice(dataTable.cell(1, 2));
		//driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1, 3));
		ebayadvancedsearch_actions.enterMaxPrice(dataTable.cell(1, 3));
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='adv-s mb space-top']//button[@class='btn btn-prim'][contains(text(),'Search')]")).click();
		ebayadvancedsearch_actions.clickOnSearchItem();
	}
}
