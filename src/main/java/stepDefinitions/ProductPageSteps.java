package stepDefinitions;
import java.io.IOException;
import java.util.Map;

import com.qa.PageObjects.HomePage;
import com.qa.PageObjects.ProductListingPage;
import com.qa.TestBase.TestContext;
import com.qa.misc.Global_Variable;
import com.qa.utils.PropertiesFileReader;
import com.qa.utils.TestDataHandler;
import com.qa.utils.TestDataHandler_singleton;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
public class ProductPageSteps {
	
	TestContext testContext;
	ProductListingPage productpage;
	
	
	public ProductPageSteps(TestContext context) throws IOException
	{
		testContext = context;
		productpage=testContext.getPageObjectManager().getproductlistingpage();
	}
	@When("^user search for products$")
	public void user_search_for_products() throws Throwable {
		
	
		
		productpage.search_product();
		
		//productpage.close_page();
	}


}
