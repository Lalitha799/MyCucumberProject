package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		          features = "src//test//resources//features//store.feature",
		          glue = {"stepDefs"},
		          dryRun = false,
				  monochrome = true,
				  plugin = { "pretty",
				          "html:target/reports/HtmlReporter.html",}
		
		         )


public class StoreOrderRunner extends AbstractTestNGCucumberTests {

}
