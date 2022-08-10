package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;

public class EbayAdvancedSearch_Steps {

	WebDriver driver;
	
	public EbayAdvancedSearch_Steps(Commom_Steps commom_Steps) {
		this.driver = commom_Steps.getDriver();
	}

	@Given("I am on Ebay Advanced Search Page")
	public void i_am_on_Ebay_Advanced_Search_Page() throws Exception {
		
		
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		//Thread.sleep(1000);

	}

	@When("I clickn Ebay logo")
	public void i_clickn_Ebay_logo() {
		// driver.findElement(By.id("gh-logo")).click();
		driver.findElement(By.xpath("//a[@id='gh-la']")).click();

	}

	@Then("Navigated Ebay Home Page")
	public void navigated_Ebay_Home_Page() {
		String expurl = "https://www.ebay.com/";
		String acturl = driver.getCurrentUrl();
		if (!expurl.equals(acturl)) {
			fail("Page does not navigae to Home page");

		}
	}
		//6
		@When("I advanced Search an Item")
		public void i_advanced_Search_an_Item(DataTable dataTable) throws Exception {
		    driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1, 0));
		    driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
		    driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1, 2));
		    driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1, 3));
		    driver.findElement(By.id("searchBtnLowerLnk")).click();
		    Thread.sleep(1000);
		}

		

	}


