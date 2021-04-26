Feature: Merge lead functionality in LeafTaps Application

@functional @smoke
Scenario: TC_001 Merge two leads from search by first name

Given Enter the username as 'DemosalesManager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed
When Click on Leads link
And Click on Merge Lead link
And Choose From Lead with firstname as 'Sahaya'
And Choose To Lead with firstname as 'Sanjay'
And Click on Merge
Then From lead should NOT be present