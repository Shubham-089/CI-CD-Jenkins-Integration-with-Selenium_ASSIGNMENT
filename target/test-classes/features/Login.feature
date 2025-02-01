Feature: Login

  Scenario: Logging in with positive credentials
    Given user launches the Chrome browser
    When user opens URL "https://v1.training-support.net/selenium/simple-form"
    And user enters the firstName as "Shubham"
    And user clicks on lastName as "yetonde"
    Then user clicks on email as "shubhamyetonde2345@gmail.com"
    When user clicks on the filed "Hey"
    Then user is redirected to sumit
    And close Browser
 

