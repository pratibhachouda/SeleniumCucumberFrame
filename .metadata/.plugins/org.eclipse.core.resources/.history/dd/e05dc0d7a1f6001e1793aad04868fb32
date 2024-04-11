@SalesForceLeadTest
Feature: Salesforce Lead Scenario

  Scenario: Creating Lead Using saleforce

  @Creatleadsinsalesforce
  Scenario Outline: Creating a Leads
    Given Launch the sf Application
    When User is on Home Page,Click on Application Launcher
    And Selcted Sales from application Launcher
    And on sales Dashboard click on Leads
    And Click on New to create a Lead
    And Enter all the required Filed "<FirstName>" "<LastName>" "<Company>" and click Sav
    Then Now Lead Created using Following Details successfully

    Examples: 
      | FirstName | LastName | Company |
      | Sarita    | Mishra   | Target  |
      | Advik     | Mishra   | Nike    |
