Feature: Customer API test

@TestSample
Scenario: Test List All Customers functionality
  Given Validate list all customers functionality

@TestSample
Scenario Outline: Test correct details are fetched for customers
  Given Validate response for customer <customer> has id <id>, email <email>, first name <firstname> and last name <lastname>
  Examples:
    |customer |id    |email            |firstname    |lastname   |
    |1111     |1111  |testerA@abc.com  |testerBFirst |testerBLast|
    |2222     |2222  |testerB@abc.com  |testerBFirst |testerBLast|
    |3333     |3333  |testerC@abc.com  |testerCFirst |testerCLast|
    |4444     |3333  |testerD@abc.com  |testerDFirst |testerDLast|
    |5555     |5555  |testerE@abc.com  |testerEFirst |testerELast|
    |6666     |6666  |testerF@abc.com  |testerFFirst |testerFLast|

@TestSample
Scenario: Validate failure scenario
  Given Validate response for customer 11 has status fail, code 1, and message Customer details not found.