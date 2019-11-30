package stepDefinitions;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.qa.Helper.ActionHelper;
import com.qa.Helper.JavaScriptHelper;
import com.qa.Helper.ScreenRecorderHelper;
import com.qa.PageObjects.HomePage;
import com.qa.TestBase.TestContext;
import com.qa.utils.ExcelHandler;
import com.qa.utils.PropertiesFileReader;
import com.qa.utils.TestDataHandler;
import com.qa.utils.TestDataHandler_singleton;
import com.qa.utils.WebDriverManager_setup;

import cucumber.api.Scenario;
import cucumber.api.java.en.*;
public class HomePageSteps {
	
	PropertiesFileReader prop;
	public TestDataHandler testdata;
	TestContext testContext;
	HomePage homepage;
	public HomePageSteps(TestContext context) throws IOException
	{
		testContext = context;
		/*prop= new PropertiesFileReader();
		prop.getProperty(""+System.getProperty("user.dir")+"//src//main//java//com//qa//config//config.properties");*/
		//testdata=new TestDataHandler();
		homepage=testContext.getPageObjectManager().getHomePage();
		
	}
	WebDriverManager_setup driver_init;
	WebDriver driver;
	Map<String,String> testdata_mapping=TestDataHandler_singleton.getInstance().getTestDataInMap();
	@Given("^User naviagate to Home Page$")
	public void user_naviagate_to_Home_Page() throws Throwable 
	{
		
		homepage.navigate_to_homepage();
		String scenario_name=testdata_mapping.get("Scenario").replaceAll(" ", "_");
		String video_mode=testdata_mapping.get("VideoRecorder");
		if(video_mode.equalsIgnoreCase("Yes"))
		{
		ScreenRecorderHelper.startRecording(scenario_name);
		}
		
	}
	@When("^user logged with valid credentials$")
	public void user_logged_with_valid_credentials() throws Throwable {
		homepage.customer_login();
	}
	
	/**
	 * Enter Data using without DataTable
	 * @param arg1
	 * @param arg2
	 * @throws Throwable
	 */
	@When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_username_and_password(String username, String password){
		
		driver=testContext.getwebdrivermanager().driver;
		JavaScriptHelper.waitForLoad(driver);
		 ActionHelper.mouseHover(testContext.getwebdrivermanager().driver, driver.findElement(By.xpath("//div[@class='desktop-userIconsContainer']")));
		 //profile_menu.click();
		 driver.findElement(By.xpath("//a[@class='desktop-linkButton' and @data-track='login']")).click();
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

		 JavaScriptHelper.clickElement(driver.findElement(By.xpath("//button[@class='login-login-button']")), driver);
			    
	}
	
	/**
	 *  Enter Data using with scenario outline without Map
	 * @param username
	 * @param password
	 */
	@When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\" without map$")
	public void user_enter_username_and_password_without_map(String username, String password) {
		driver=testContext.getwebdrivermanager().driver;
		JavaScriptHelper.waitForLoad(driver);
		 ActionHelper.mouseHover(testContext.getwebdrivermanager().driver, driver.findElement(By.xpath("//div[@class='desktop-userIconsContainer']")));
		 //profile_menu.click();
		 driver.findElement(By.xpath("//a[@class='desktop-linkButton' and @data-track='login']")).click();
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

		 JavaScriptHelper.clickElement(driver.findElement(By.xpath("//button[@class='login-login-button']")), driver);
	   
	}
}
