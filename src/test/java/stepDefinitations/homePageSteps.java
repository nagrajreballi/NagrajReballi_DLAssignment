package stepDefinitations;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.homePage;
import com.pages.loginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class homePageSteps {
	 private homePage homepage = new homePage(DriverFactory.getDriver());
	 private loginPage loginpage = new loginPage(DriverFactory.getDriver());
	 static String title;
	static  String textEl;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		DriverFactory.getDriver().get("https://www.saucedemo.com");
		homepage = loginpage.doLogin(userName, password);
		}

	/*@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		String title = loginpage.getLoginPageTitle();
		System.out.println("Page title is: " + title);	
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertEquals(title.contains(expectedTitleName), "Swag Labs");
		
	}
	*/
	
	@When("user gets the title of home the page")
	public void user_gets_the_title_of_home_the_page() { 
		 title = homepage.getHomePageTitle();
		System.out.println("Home Page title is: " + title);
	}
	
	@Then("home page title should be {string}")
	public void home_page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	

}
