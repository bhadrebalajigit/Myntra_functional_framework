package com.qa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.qa.misc.Global_Variable;

public class CartPage {
	
 
 
	WebDriver driver;
	@FindBy(xpath="(//*[text()='Add to bag'])[1]")
	private WebElement first_product;
	public CartPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	
		 }

	public void add_first_product() 
	{
		
		
		first_product.click();
	}
	
}
