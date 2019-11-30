package com.qa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
     
	
}
