package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	  @FindBy(xpath = "//div[@class='table-responsive']//tr")
	  List<WebElement> listOfProducts;
	  
	  @FindBy(xpath = "//div[@class='table-responsive']//tr[@class='success']//a")
	  List<WebElement> deleteBtn;
	  
	  public CartPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public boolean isProductsAvailable()
	  {
		  if(listOfProducts.size()>0)
			  return true;
		  else
			  return false;
	  }
	  
	  public void deleteItems() throws InterruptedException
	  {
		  deleteBtn.get(2).click();
		  Thread.sleep(2000);
		  deleteBtn.get(4).click();
		  Thread.sleep(2000);
	  }
}
