package com.qa.PageObjects;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.security.auth.PrivateCredentialPermission;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.qa.Helper.ActionHelper;
import com.qa.Helper.WaitHelper;
import com.qa.misc.Global_Variable;
import com.qa.utils.TestDataHandler_singleton;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class ProductListingPage {
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement  search_product;
	
	@FindBy(xpath="(//*[text()='Add to bag'])[1]")
	private WebElement adding_tshirt;
	
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement  profile_menu;
	
	
	WebDriver driver;
	public ProductListingPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		 }

	Map<String,String> testdata_mapping=TestDataHandler_singleton.getInstance().getTestDataInMap();
	public void search_product() throws InterruptedException
	 {
		Reporter.addStepLog("Titile of page:"+driver.getTitle()+"");
		//WaitHelper.visibilityOfElementLocated(driver, search_product);
		ActionHelper.mouseHover(driver, profile_menu);
		//Thread.sleep(10000);	
		WaitHelper.visibilityOfElementLocated(driver, search_product);
		search_product.sendKeys(testdata_mapping.get("product"),Keys.ENTER); 
		//adding_tshirt.click();
		
		String expected_tilte=Global_Variable.getter_title();
		String actual_title=driver.getTitle();
		if(expected_tilte.equalsIgnoreCase(actual_title))
		{
			Reporter.addStepLog(actual_title+" is matached with expected"+expected_tilte);
		}
		
		
	 }
	
	public void close_page() throws InterruptedException
	 {
		driver.close();
		
		
	 }
	
	
}
