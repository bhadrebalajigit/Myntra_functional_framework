package com.qa.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qa.utils.WebDriverManager_setup;

public class PageObjectManager {
	
	private WebDriver driver;
	private CartPage cartpage;
	private CheckoutPage checkoutpage;
	private HomePage homepage;
	private ProductListingPage productlistingpage;
	private WebDriverManager_setup driver_setup;
	public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
	
	public HomePage getHomePage() throws IOException
	
		{
		 
		 return (homepage == null) ? homepage = new HomePage(driver) : homepage;
		 
		 }
	
	public CartPage getCartPage()
		{
		 
		 return (cartpage == null) ? cartpage = new CartPage(driver) : cartpage;
		 
		 }
	
	public CheckoutPage getcheckoutpage()
	{
	 
	 return (checkoutpage == null) ? checkoutpage = new CheckoutPage(driver) : checkoutpage;
	 
	 }
	
	public ProductListingPage getproductlistingpage()
	{
	 
	 return (productlistingpage == null) ? productlistingpage = new ProductListingPage(driver) : productlistingpage;
	 
	 }
	
	public WebDriverManager_setup getwebdriver_context()
	{
	 
	 return (driver_setup == null) ? driver_setup = new WebDriverManager_setup() : driver_setup;
	 
	 }
}
