Feature: Delete lead functionality in LeafTaps Application

@regression
Scenario: TC_001 Delete a lead from search by phone number

Given Enter the username as 'DemosalesManager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed
When Click on Leads link
When Click on Find Leads by Phone button
And Search with phone number as '99'
And Click Find Leads button
And Choose first lead
And Click on Delete lead
Then Lead should NOT be present