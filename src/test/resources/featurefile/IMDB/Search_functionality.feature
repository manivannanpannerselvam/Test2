@IMDB_search_Functionality
Feature: verify the IMDB_Search_Functionality

 
  Scenario: Verify the search box present auto-suggestions when the query is being typed
    Given open the valid url in IMDb application
    Then  Enter the valid search name in search field "Prime"
    Then  Verify the All prime name flim list in drop down list "Prime"
   

 Scenario: Verified Without entering anything click on Search button
    Given open the valid url in IMDb application
    Then  click the search icon in search field
    Then  Verify proper message should be displayed
    
    Scenario: Verified edit and Delete option in search field
    Given open the valid url in IMDb application
    Then  Enter the valid search name in search field "Prime"
    Then  user should be edit the search field
    Then  Enter the valid search name in search field "Prime name"
    Then  Verify New search data should be displayed in search field  "Prime name"   
    
    
    Scenario Outline: Verified the % sign in search keyword should not redirect to 404 ERROR
    Given open the valid url in IMDb application
    Then  Enter the Html query in search field "<SearchNames>"
    Then  click the search icon in search field
    Then  Verify no result found alert message should be display "No results found"
    
     Examples: 
    | SearchNames          |        
    | <script>alert(1)</script> |
    
   
 Scenario Outline: Verify the  characters ,number and special character allowed to be entered into the search box.
    Given open the valid url in IMDb application
    Then  Enter the Data in search text field "<SearchNames>"
    Then  Verify the text and number should be displayed in search textbox"<SearchNames>"
   
   Examples: 
   | SearchNames          |                   
   | New Hollywood flim   |
   | 012345678901         |
   | !@%^&&*(**           |
   | ABCSDSDSD2342343242  |
   
   
   
   