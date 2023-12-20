package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.StoreTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.CartPage;
import pages.StoreLoginPage;


public class StoreOrderStepDef {

	WebDriver driver=StoreTestBase.getDriver();
	StoreLoginPage loginPage;
	AddToCartPage addToCartPage;
	CartPage cartPage;
	public StoreOrderStepDef()
	{
		loginPage=new StoreLoginPage(driver);
		addToCartPage=new AddToCartPage(driver);
		cartPage=new CartPage(driver);
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
	public void add_an_item_to_cart() throws InterruptedException {
	    addToCartPage.addItems(driver);
	}

	@Then("Items must be added to cart")
	public void items_must_be_added_to_cart() {
		
	    Assert.assertTrue(addToCartPage.isOnCart());   
	}
	
	@When("List of Items should be available in cart")
	public void list_of_items_should_be_available_in_cart() {
	  
		cartPage.isProductsAvailable();
	}

	@Then("Delete an item from cart")
	public void delete_an_item_from_cart() throws InterruptedException {
	    cartPage.deleteItems();
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
