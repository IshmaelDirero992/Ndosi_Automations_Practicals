Feature: landing AND login Page Functionality.

  # This is a **User Story**
  As a user
  I want to log into the Application
  So that I can access my account

  Scenario: User is on landing and login page screen.

    Given user has openWebsite and logged into Automations bootCamp.
    Then user clicks on LEARNING MATERILAS button
    And enters EMAIL
    And enters PASSWORD
    And click on LOGIN button
    Then the user should be redirected to the welcome page.


    # Negative Test for Login attempts

#  Scenario: User attempts login with invalid credentials
#    When the user enters username "wronguser"
#    And the user enters password "wrongpass"
#    And the user clicks the login button
#    Then an error message should be displayed
#    And the user should remain on the login page
#
#  Scenario: User tries to log in with empty fields
#    When the user clicks the login button
#    Then a validation message should be shown
#    And the login should not proceed
#
#  Scenario: User uses forgot password link
#    When the user clicks the "Forgot Password" link
#    Then the user should be redirected to the password recovery page
