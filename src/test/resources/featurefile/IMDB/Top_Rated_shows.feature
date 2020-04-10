@IMDB_Top_Rated_show
Feature: verify the Top Rated show_Functionality

 
  Scenario: Verify the Top Rated show icon
    Given open the valid url in IMDb application
    Then  click the Menu icon in IMDb screen
    Then  click the Top Rated Shows icon 
    Then  Verify Top Rated shows screen is displayed "Top Rated TV Shows"
   
 Scenario: Verify Search for ‘Game of thrones’ and select ‘Game of Thrones
    Given open the valid url in IMDb application
    Then  Enter the valid search name in search field "Game of thrones"
    Then click the Game of Thrones The Last Watch link
    
    Scenario: Verify Title of the selected episode 
    Given open the valid url in IMDb application
    Then  Enter the valid search name in search field "Game of thrones"
    Then  click the Game of Thrones The Last Watch link
    Then  Verify the Title of the selected episode "Game of Thrones: The Last Watch (2019)"
    
    Scenario: Verify Number of review in Game of Thrones 
    Given open the valid url in IMDb application
    Then  Enter the valid search name in search field "Game of thrones"
    Then  click the Game of Thrones The Last Watch link
    Then  Verify the number of review in Game of Thrones
    
    
    