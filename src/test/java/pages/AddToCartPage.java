package pages;

import org.openqa.selenium.Alert;
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
	
	@FindBy(xpath = "//h2[text()='Products']")
	WebElement productTitle;
	
	@FindBy(xpath = "//a[text()='Cart']")
	WebElement cart;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addItems(WebDriver driver) throws InterruptedException
	{
	  for(int i=0;i<3;i++)
	  {
		item1.click();
		addToCart.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.navigate().back();
		driver.navigate().back();
		item2.click();
		addToCart.click();
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
		alert.accept();
		driver.navigate().back();
		driver.navigate().back();
		
	  }
		
	}
	
	public boolean isOnCart()
	{
		cart.click();
		return productTitle.isDisplayed();
	}
	
}
