Feature: Title of your feature
 
  @SmokeTest
  Scenario: Demo for Regression testing
    Given This statement execute smoke test scripts
     
   @RegressionTest
   Scenario: Demo for smoke testing
    Given This statement execute regression test scripts
    
   @SmokeTest @RegressionTest
   Scenario: Demo for smoke testing
    Given This statement execute smoke and regression test scripts
    
