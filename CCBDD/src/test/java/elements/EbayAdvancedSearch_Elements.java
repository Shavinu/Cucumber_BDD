package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvancedSearch_Elements {

	WebDriver driver;
	
	@FindBy(xpath= "//td[@class='gh-td']") public WebElement ebayLogo;
	@FindBy(css = "#_nkw") public WebElement searchString;
	@FindBy(id = "_ex_kw") public WebElement excludeString;
	@FindBy(xpath = "//input[@name='_udlo']") public WebElement minPrice;
	@FindBy(xpath = "//input[@name='_udhi']") public WebElement maxPrice;
	@FindBy(xpath = "//button[@id='searchBtnLowerLink']") public WebElement srchBtn;
	
	public EbayAdvancedSearch_Elements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
}
