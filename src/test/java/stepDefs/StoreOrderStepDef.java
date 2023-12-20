package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.StoreTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.StoreLoginPage;


public class StoreOrderStepDef {

	WebDriver driver=StoreTestBase.getDriver();
	StoreLoginPage loginPage;
	AddToCartPage addToCartPage;
	
	public StoreOrderStepDef()
	{
		loginPage=new StoreLoginPage(driver);
		addToCartPage=new AddToCartPage(driver);
	}
	
	@Given("User is on login Page")
	public void user_is_on_login_page() {
		
	    driver.get("https://www.demoblaze.com/");
	}
	
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws InterruptedException {
	   loginPage.loginIntoApp(string, string2);
	}
	@Then("User should be on Home page")
	public void user_should_be_on_home_page() throws InterruptedException {
	    
		Assert.assertTrue(loginPage.isOnHomePage());
	}
	
	@When("Add an item to cart")
	public void add_an_item_to_cart() {
	    addToCartPage.addItems();
	}

	@Then("Items must be added to cart")
	public void items_must_be_added_to_cart() {
	    
	}
	
	@When("List of Items should be available in cart")
	public void list_of_items_should_be_available_in_cart() {
	  
	}

	@Then("Delete an item from cart")
	public void delete_an_item_from_cart() {
	    
	}

	
	@Given("Items should be available in cart")
	public void items_should_be_available_in_cart() {
	    
	}
	@When("Place Order")
	public void place_order() {
	    
	}
	@Then("Purchase Items")
	public void purchase_items() {
	    
	}
}
