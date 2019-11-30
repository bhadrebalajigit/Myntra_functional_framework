Feature: Verify content on home page

 
# @HomeTest 
#Scenario: Verify user can buy product from myntra site
# Given Read the Test data form Test data file for TC number one
# Given User naviagate to Home Page
#When user logged with valid credentials
# When user search for products
## And user added product to cart
## Then user proceed from cart
## Then validated address details
## Then validate details on checkout page
# 
# 
#
#Scenario: Verify user can search for products
# Given Read the Test data form Test data file for TC number two
# Given User naviagate to Home Page
#When user logged with valid credentials
# When user search for products
  
  
   @HomeTest 
Scenario: Verify user can search for products
 Given Read the Test data form Test data file for existing customer "TC_001"
 Given User naviagate to Home Page
When user logged with valid credentials
 When user search for products
 And user added product to cart
  
 
  