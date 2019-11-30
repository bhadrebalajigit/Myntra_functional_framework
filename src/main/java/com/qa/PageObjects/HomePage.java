package com.qa.PageObjects;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.qa.Helper.ActionHelper;
import com.qa.Helper.JavaScriptHelper;
import com.qa.misc.Global_Variable;
import com.qa.utils.JSWaite;
import com.qa.utils.PropertiesFileReader;
import com.qa.utils.TestDataHandler_singleton;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement  profile_menu;
	
	@FindBy(xpath="//a[@class='desktop-linkButton' and @data-track='login']")
	private WebElement  Login_menu;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement  email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement  password;
	
	
	@FindBy(xpath="//button[@class='login-login-button']")
	private WebElement login_button;
	
	PropertiesFileReader prop;
	 public HomePage(WebDriver driver) throws IOException {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 prop= new PropertiesFileReader();
	 prop.getProperty(""+System.getProperty("user.dir")+"//src//main//java//com//qa//config//config.properties");
	 }
	 
	 Map<String,String> testdata_mapping=TestDataHandler_singleton.getInstance().getTestDataInMap();
	 public void customer_login()
	 {
		 JavaScriptHelper.waitForLoad(driver);
		 ActionHelper.mouseHover(driver, profile_menu);
		 //profile_menu.click();
		 Login_menu.click();
		 String username=testdata_mapping.get("Username");
		 email.sendKeys(username);
		 Reporter.addStepLog("name of user logged:"+username);
		 String Password=testdata_mapping.get("Password");
		 password.sendKeys(Password);
		 
		 //login_button.click();
		 JavaScriptHelper.clickElement(login_button, driver);
		 
		
	 }
	 
	 public void navigate_to_homepage()
	 {
		
		 driver.get(""+prop.getkey("url")+"");
		 JSWaite.waitUntilJSReady(driver);
		 Global_Variable.setter_title(driver.getTitle());
	 }
	 
	 
	 
	 
}
