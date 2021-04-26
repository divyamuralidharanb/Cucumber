Feature: Login functionality for LeafTaps application

#Background:
#Given Open the chrome browser
#And Load the application url


#Scenario Outline: TC001_Login with valid credentials
@smoke
Scenario: TC001_Login with valid credentials

#Given Open the chrome browser
#And Load the application url
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed

#Examples:
#|username|password|
#|'DemoSalesManager'|'crmsfa'|
#|'DemoCSR'|'crmsfa'|
 
#@functional 
#Scenario: TC002_Login with invalid credentials

#Given Enter the username as 'DemoSalesManager'
#And Enter the password as 'crmsfa123'
#When Click on Login button
#But Error message should be displayed


