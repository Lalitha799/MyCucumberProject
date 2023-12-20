package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StoreTestBase {

	private static StoreTestBase storeTestBase;
	private static WebDriver driver;
	public static Properties prop;
	
	private StoreTestBase() {
	{
		String strBrowser="chrome";
		
		if(strBrowser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		
		else if(strBrowser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			
		}

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().deleteAllCookies();
	}
	}
		
	public static void initDriver()
	{
		if(storeTestBase==null)
			storeTestBase=new StoreTestBase();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	public static void openUrl(String url)
	{
		driver.get(url);
	}
	
	public static void tearDown()
	{
		if(driver!=null)
	{
			driver.close();
			driver.quit();
	}
		
		storeTestBase=null;
	}
}
