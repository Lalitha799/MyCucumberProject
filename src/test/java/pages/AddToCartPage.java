package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.reactivex.rxjava3.functions.Action;

public class AddToCartPage {

	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	WebElement item1;
	
	@FindBy(xpath = "//a[text()='Nokia lumia 1520']")
	WebElement item2;
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addToCart;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addItems()
	{
		item1.click();
		addToCart.click();
		item2.click();
		addToCart.click();
		
	}
}
