Feature: Smoke Test Cases

  @SmokeTest
  Scenario: Scenario1
  Given Smoke Test Case One
  
  @SmokeTest
  Scenario: Scenario2
  Given Smoke Test Case Two
  
  @SmokeTest
  Scenario: Scenario3
  Given Smoke Test Case Three
  
  @SmokeTest
  Scenario: Scenario4
  Given Smoke Test Case four
  
  @SmokeTest
  Scenario: Scenario5
  Given Smoke Test Case five
  
  @SmokeTest
  Scenario: Scenario6
  Given Smoke Test Case six
  
  @SmokeTest
  Scenario: Scenario8
  Given Smoke Test Case eight "Anvai" and "Jawaji"
  
  @SmokeTest
  Scenario Outline: Scenario7
  Given Smoke Test Case with "<UserName>" and "<Password>"
  
  Examples: 
  
  | UserName | Password |
  | Gagan    | Gagan    |
  | Abhi     | Abhi     |
  

  