package stepDefinitions;
import java.util.Map;

import com.qa.utils.TestDataHandler;
import com.qa.utils.TestDataHandler_singleton;

import cucumber.api.java.en.*;
public class AddressPageSteps {
	
	
	@Then("^validated address details$")
	public void validated_address_details() throws Throwable {
		Map<String,String> testdata_mapping=TestDataHandler_singleton.getInstance().getTestDataInMap();
		
	  System.out.println("username:"+testdata_mapping.get("Username"));
		
	}

}
