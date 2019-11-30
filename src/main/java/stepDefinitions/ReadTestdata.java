package stepDefinitions;

import java.io.IOException;
import java.util.Map;

import com.qa.utils.ExcelHandler;
import com.qa.utils.PropertiesFileReader;
import com.qa.utils.TestDataHandler;
import com.qa.utils.TestDataHandler_singleton;

import cucumber.api.java.en.Given;

public class ReadTestdata {
	
	
	PropertiesFileReader prop;
	
	public ReadTestdata() throws IOException
	{
		prop= new PropertiesFileReader();
		prop.getProperty(""+System.getProperty("user.dir")+"//src//main//java//com//qa//config//config.properties");
		
	}

	@Given("^Read the Test data form Test data file for TC number one$")
	public void read_the_Test_data_form_Test_data_file_for_TC_number_one() throws Throwable {
		Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap(""+System.getProperty("user.dir")+""+prop.getkey("testDataFile")+"", ""+prop.getkey("sheetName")+"", "TC_001");
		//testdata.setTestDataInMap(TestDataInMap);
		TestDataHandler_singleton.getInstance().setTestDataInMap(TestDataInMap);
		/*String browser=TestDataInMap.get("Browser");
		System.out.println("Testdata:"+browser);*/
	}
	
	@Given("^Read the Test data form Test data file for TC number two$")
	public void read_the_Test_data_form_Test_data_file_for_TC_number_two() throws Throwable 
	{
		Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap(""+System.getProperty("user.dir")+""+prop.getkey("testDataFile")+"", ""+prop.getkey("sheetName")+"", "TC_002");
		//testdata.setTestDataInMap(TestDataInMap);
		TestDataHandler_singleton.getInstance().setTestDataInMap(TestDataInMap);
	}

	@Given("^Read the Test data form Test data file for existing customer \"([^\"]*)\"$")
	public void read_the_Test_data_form_Test_data_file_for_existing_customer(String TestID) throws Throwable 
	{
		Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap(""+System.getProperty("user.dir")+""+prop.getkey("testDataFile")+"", ""+prop.getkey("sheetName")+"", TestID);
		//testdata.setTestDataInMap(TestDataInMap);
		TestDataHandler_singleton.getInstance().setTestDataInMap(TestDataInMap);
	}
}
