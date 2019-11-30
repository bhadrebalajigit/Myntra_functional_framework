package stepDefinitions;


import java.io.IOException;
import java.util.Map;

import com.qa.PageObjects.CartPage;
import com.qa.PageObjects.HomePage;
import com.qa.TestBase.TestContext;
import com.qa.utils.PropertiesFileReader;
import com.qa.utils.TestDataHandler_singleton;

import cucumber.api.java.en.*;
public class CartPageSteps {
	
	TestContext testContext;
	CartPage cartpage;
	Map<String,String> testdata_mapping=TestDataHandler_singleton.getInstance().getTestDataInMap();
	public CartPageSteps(TestContext context) throws IOException
	{
		testContext = context;
		cartpage=testContext.getPageObjectManager().getCartPage();	
	}
	
	@When("^user added product to cart$")
	public void user_added_product_to_cart() throws Throwable {
		cartpage.add_first_product();
	}
	
	@Then("^user proceed from cart$")
	public void user_proceed_from_cart() throws Throwable {
	    
	}

}
