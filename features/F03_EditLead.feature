Feature: Edit a lead in LeafTaps application

@functional
Scenario: TC001_Edit Company name after finding a lead by phone number

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
And Choose to edit Lead link
And Update company name as 'Citeus'
And Click on Submit button
Then Company should get updated as 'Citeus'