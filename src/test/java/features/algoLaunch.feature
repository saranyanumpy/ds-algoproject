
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Navigate to Homepage
    Given User launch chrome browser
    
    When User opens URL "https://dsportalapp.herokuapp.com/"
    
    And click on "Get started"
    
    Then Page Title should be "NumpyNinja"

 