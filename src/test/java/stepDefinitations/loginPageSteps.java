package stepDefinitations;
import org.testng.annotations.Test;

import com.pages.loginPage;
import com.qa.factory.DriverFactory;
//import org.openqa.selenium.testngannotatios;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class loginPageSteps {


	private loginPage loginpage = new loginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver()
		.get("https://www.saucedemo.com");
	}

	//
	//@Test(priority =1)
	@When("^user enters Invalid username (.*)$")
	public void user_enters_invalid_username(String username) {
		loginpage.enterUserName(username);
	}

	@When("^user enters valid password (.*)$")
	public void user_enters_valid_password(String password) {
		loginpage.enterPassword(password);
	}

	@Then("^user clicks on the login button for Invalid username $")
	public void user_clicks_on_the_login_button_for_Invalid_username() {
		loginpage.clickOnLogin();
	}

	
	
	//
	@When("^user enters valid username (.*)$")
	public void user_enters_valid_username(String username) {
		loginpage.enterUserName(username);
	}

	@When("^user enters Invalid password (.*)$")
	public void user_enters_invalid_password(String password) {
		loginpage.enterPassword(password);
	}
	
	@Then("^user clicks on the login button for Invalid password $")
	public void user_clicks_on_the_login_button_for_Invalid_password() {
		loginpage.clickOnLogin();
	}
	
	
	
	//
	@When("^user enters valid userName for valid credentials (.*)$")
	public void user_enters_valid_userName_for_valid_credentials(String username) {
		loginpage.enterUserName(username);
	}

	@When("^user enters valid passWord for valid credentials (.*)$")
	public void user_enters_valid_passWordfor_valid_credentials(String password) {
		loginpage.enterPassword(password);
	}
	
	@Then("^user clicks on the login button for valid credentials$")
	public void user_clicks_on_the_login_button_for_valid_credentials() throws InterruptedException {
		loginpage.clickOnLogin();
		
		Thread.sleep(5000);
	}
	
	
	
	
}
