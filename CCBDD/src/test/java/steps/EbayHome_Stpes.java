package steps;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import actions.Common_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Stpes {
	Common_Actions common_actions;
	EbayHome_Actions ebayHome_actions;
	
	WebDriver driver;

	public EbayHome_Stpes(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
	}

	@Given("I am on Ebay Home Page")
	public void i_am_on_Ebay_Home_Page() {
		driver.get("https://www.ebay.com/");
	}

	@When("I click on Advanced Link")
	public void i_click_on_Advanced_Link() {		
		ebayHome_actions.clickAdvancedLink();
	}

	@Then("I navigate to Advanced Search Page")
	public void i_navigate_to_Advanced_Search_Page() {
		String expURL = "https://www.ebay.com/sch/ebayadvsearch";
		String curURL = driver.getCurrentUrl();
		if (!expURL.equals(curURL)) {
			fail("Page does not navigated to expectde page");
		}
	}

	@When("I search for {string}")
	public void i_search_for_iPhone(String str1) {
		driver.findElement(By.id("gh-ac")).sendKeys(str1);
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}

	@Then("I validate that number of search results are more than {int}")
	public void i_validate_that_number_of_search_results_are_more_than(int num1) {
		ebayHome_actions.getSearchItemCount();
	}

	@Given("I am on the Ebay Home Page")
	public void i_am_on_the_Ebay_Home_Page() {
		driver.get("https://www.ebay.com/");
	}

	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String string, String string2) throws Exception {
		driver.findElement(By.id("gh-ac")).sendKeys(string);
		driver.findElement(By.id("gh-cat")).click();
		List<WebElement> cat = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		for (WebElement x : cat) {
			if (x.getText().toLowerCase().trim().equals(string2.toLowerCase())) {
				x.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("#gh-btn")).click();
		Thread.sleep(1000);
	}

	@Given("I am on Ebay Home Pgae")
	public void i_am_on_Ebay_Home_Pgae() {
		driver.get("https://www.ebay.com/");
	}

	@When("I click on {string}")
	public void i_click_on(String string) throws Exception {
		driver.findElement(By.linkText(string)).click();
		Thread.sleep(1000);
	}

	@Then("I validate that page navigates to {string} and {string}")
	public void i_validate_that_page_navigates_to_and(String url, String title) {
		String actURL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		if (!actURL.equals(url)) {
			fail("Operation Failed, Expected result failed! " + url);
		}
		if (!actTitle.contains(title)) {
			fail("Operation Failed, Expected result failed! " + title);
		}
	}

}
