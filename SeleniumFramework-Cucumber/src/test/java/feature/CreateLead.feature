@SalesForceLead
Feature: Salesforce Lead
Creating a Salesforce Lead
 # Background: User Login
 # Given Launch the Salesforce 
 # When Enter Username
 # Then Enter Password
  #Then Click Logiin Button

  @Creatleads
  Scenario Outline: Create a Lead
    Given Launch the Salesforce Application
    When User is on Home Page,Click on App Launcher
    And Selcted Sales from app Launcher
    And User is on sales Dashboard click on Leads
    And Click on New to create a New Lead
    And Enter all the Mandatory Fileds "<FirstName>" "<LastName>" "<Company>" and click Save
    Then Lead should Created using given Name successfully

    Examples: 
      | FirstName | LastName | Company |
      | Ravi      | Mishra   | Nike    |
      | Harshala  | Mishra   | Target  |
      
    Scenario: This is First Scenario
    Given First Step
    When Second Step
    Then Third Step
      

  Scenario: This is Second Scenario
    Given First Step
    When Second Step
    Then Third Step

  Scenario: This is Third Scenario
    Given First Step
    When Second Step
    Then Third Step
