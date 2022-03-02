#Author: Shwetank Vashishtha
#Date: 02/28/2022

Feature: Validate app installation

  Scenario: Check Jira marketplace app installation
    Given User is redirected to Jira sign in page
    When User sign in using valid login email address
    Then User should be able to install app