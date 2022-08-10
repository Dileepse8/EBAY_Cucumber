package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.fail;
//import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	public WebDriver driver;


	public EbayHome_Steps(Commom_Steps commom_Steps) {
		this.driver = commom_Steps.getDriver();
	}

	@Given("I am on eBay Home Page")
	public void i_am_on_eBay_Home_Page() {

		driver.get("https://www.ebay.com/");

	}

	@When("I click on Advanced Link")
	public void i_click_on_Advanced_Link() throws InterruptedException {
		// driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Advanced")).click();

	}

	@Then("I navigate toAdvanced Search Page")
	public void i_navigate_toAdvanced_Search_Page() {
		String expurl = "https://www.ebay.com/sch/ebayadvsearch";
		String acturl = driver.getCurrentUrl();
		if (!expurl.equals(acturl)) {
			fail("Page does not navigae to expected page");
			//System.out.println("Page does not navigae to expected page");

		}

	}

	@When("I search for {string}")
	public void i_search_for_iphone12(String item)  {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(item);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		//Thread.sleep(1000);
	}

	@Then("I validate atleast {int} search items present")
	public void i_validate_atleast_search_items_present(int count) {
		String itemcount = driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child"))
				.getText().trim();
		String itemcount2 = itemcount.replace(",", "");
		int itemcountInt = Integer.parseInt(itemcount2);

		if (itemcountInt <= count) {
			fail("Less than 200 results as shown.");
			//System.out.println("Less than 200 results as shown.");

		}

	}

	// 4
	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String string, String string2) throws Exception {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(string);
		driver.findElement(By.xpath("//select[@id='gh-cat']")).click();
		
		/*Select sel=new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		sel.selectByVisibleText(string2);*/
		//String str=string2.toLowerCase();
		//List<WebElement> cat = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		/*for (int i = 0; i <= cat.size(); i++) {
			if (cat.get(i).getText().equalsIgnoreCase(str)) {
				cat.get(i).click();
				break;
			}
			
		}*/
				
		List<WebElement> cat = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		for(WebElement x : cat) {
			if ( x.getText().toLowerCase().equals(string2.toLowerCase())) {
				 x.click();
				break;
			}
		}
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		//Thread.sleep(2000);
	}
	//7
	
	@When("I click on {string}")
	public void i_click_on(String link) throws Exception {
		driver.findElement(By.linkText(link)).click();
		Thread.sleep(2000);
	   
	}

	@Then("I validate that Page navigates to {string} and title contains {string}")
	public void i_validate_that_Page_navigates_to_and_title_contains(String url, String title) throws Exception {
		//Thread.sleep(4000);
	    String acturl=driver.getCurrentUrl();
	    String acttitle=driver.getTitle();
	    if (!acturl.equals(url)) {
	    	fail("Page does not navigate to expected URL " +url);
			
		}
	    if (!acttitle.contains(title)) {
			fail("Title is Mismatched " +title);
		}
	}
	

}
