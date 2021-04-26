Feature: Duplicate lead functionality in LeafTaps Application

@functional
Scenario: TC_001 Create duplicate lead from search by phone number

Given Enter the username as 'DemosalesManager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed
And  Click on Leads link
When Click on Find Leads by Phone button
And Search with phone number as '99'
And Click Find Leads button and choose first
And Choose to Create Duplicate lead
Then Duplicate Lead page should be displayed
And Click on Submit button
Then View Lead should be displayed