package com.qa.TestBase;

import java.util.Map;

import com.qa.PageObjects.PageObjectManager;
import com.qa.utils.TestDataHandler_singleton;
import com.qa.utils.WebDriverManager_setup;

public class TestContext 
	{
	
	 private WebDriverManager_setup webdrivermanager;
	 private PageObjectManager pageobjectmanager;
	public TestContext(){
		webdrivermanager = new WebDriverManager_setup();
		Map<String,String> testdata_mapping=TestDataHandler_singleton.getInstance().getTestDataInMap();
		pageobjectmanager = new PageObjectManager(webdrivermanager.getDriver(testdata_mapping.get("Browser")));
		 }
	
	public PageObjectManager getPageObjectManager() 
	{
		return pageobjectmanager;
	}
		public WebDriverManager_setup getwebdrivermanager() 
		{
			return webdrivermanager;
	    }

	}