Feature: Create Lead functionality for LeafTaps application

@functional @regression
Scenario: TC001_Create a new lead

#Given Open the chrome browser
#And Load the application url
Given Enter the username as 'DemosalesManager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed
When Click on Leads link
And Click on Create Lead link
And Enter company name as 'Infosys'
And Enter first name as 'Sahaya'
And Enter last name as 'Vijila'
And Click on Submit button
Then View Lead should be displayed
