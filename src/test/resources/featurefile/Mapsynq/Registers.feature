@Mapsyn_Register_Account
Feature: verify the create Account screen

  Scenario Outline: Verify the Create Account Screen
    Given open the valid url in Mapsynq APP
    Then click the click the Register icon in Top of the screen
    Then Enter the Firstname in firstname field "<FirstName>"
    Then Enter the lastName in LastName field "<LastName>"
    Then Enter the Date of Birth  "<DateofBirth>"
    Then Choose the Gender
    Then Enter the Email id "<Email_id>"
    Then Enter the Password in password field "<Password>"
    Then Enter the confirm password "Confirmpassword>"
    Then click the Agree button icon
    Then click the submit button
    Then Verify the Account should be created

    Examples: 
      | FirstName | LastName | DateofBirth | Email_id        | Password  | Confirmpassword |
      | Test      | Test     | 12-10-1986  | Test@gmail.com  | Ttest@238 | Ttest@238       |
      | Tests     | Tests    | 12-10-1986  | Tesst@gmail.com | Ttest@238 | Ttest@238       |
