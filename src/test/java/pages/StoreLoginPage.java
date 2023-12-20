package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreLoginPage {
	
	@FindBy(css = "a#login2")
	WebElement loginBtn;
	
	@FindBy(css = "input#loginusername")
	WebElement userName;
	
	@FindBy(css = "input#loginpassword")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnlog;

	@FindBy(css = "a#nameofuser")
	WebElement welcomeUser;
	
	public  StoreLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void loginIntoApp(String strUser,String strpwd) throws InterruptedException
	{
		loginBtn.click();
		Thread.sleep(2000);
		userName.sendKeys(strUser);
		password.sendKeys(strpwd);
		Thread.sleep(2000);
		btnlog.click();
	}
	
	

	public boolean isOnHomePage() throws InterruptedException {
		Thread.sleep(2000);
		return welcomeUser.isDisplayed();
	}


	

}
