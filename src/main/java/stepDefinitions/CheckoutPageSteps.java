package stepDefinitions;
import java.io.IOException;

import com.qa.PageObjects.CheckoutPage;
import com.qa.PageObjects.ProductListingPage;
import com.qa.TestBase.TestContext;
import com.qa.utils.PropertiesFileReader;
import com.qa.utils.WebDriverManager_setup;

import cucumber.api.java.en.*;
public class CheckoutPageSteps {

	
	TestContext testContext;
	CheckoutPage checkout;
	public CheckoutPageSteps(TestContext context) throws IOException
	{
		testContext = context;
		checkout=testContext.getPageObjectManager().getcheckoutpage();
		
	}
	@Then("^validate details on checkout page$")
	public void validate_details_on_checkout_page() throws Throwable 
	{
	
		
	}

	
}