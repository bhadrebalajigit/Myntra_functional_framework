 Feature: Verify content on regression page
 
 
 @HomeTest 
Scenario: Verify user can search for products for regression testing
 Given Read the Test data form Test data file for existing customer "TC_002"
 Given User naviagate to Home Page
When user logged with valid credentials
When user search for products
And user added product to cart

 @HomeTest 
Scenario: Verify user can login successfully
 Given Read the Test data form Test data file for existing customer "TC_003"
 Given User naviagate to Home Page
When user logged with valid credentials

@DataTable1
Scenario: Enter Data using without DataTable 
	Given Read the Test data form Test data file for existing customer "TC_005" 
	Given User naviagate to Home Page 
	When user enter username "bhadrebalaji@gmail.com" and password "jodha@123" 
	When user search for products
	
	
@DataTable1
Scenario Outline:: Enter Data using with scenario outline without Map
	Given Read the Test data form Test data file for existing customer "TC_006" 
	Given User naviagate to Home Page 
	When user enter username "<username>" and password "<password>" without map
	When user search for products
	
Examples:
|username|password|
|bhadrebalaji@gmail.com|jodha@123|
|bhadrebalaji@gmail.com|jodha@123|

@DataTable
Scenario: Enter Data using without DataTable 
	Given Read the Test data form Test data file for existing customer "TC_005" 
	Given User naviagate to Home Page 
	When user enter username  and password 
	 |bhadrebalaji@gmail.com|jodha@123|
	When user search for products