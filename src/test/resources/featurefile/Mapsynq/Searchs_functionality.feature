@MapSynq_Search_Functionality
Feature: verify the MapSynq_Search_Functionality

 
  Scenario: Verify the search box present in singapore live Traffic News
    Given open the valid url in Mapsynq APP
    Then  Enter the valid Incidents search name in search field "Traffic"
    Then  Verify the Search field should be working
    
    
   Scenario: Verified edit and Delete option in search field
    Given open the valid url in Mapsynq APP
    Then  Enter the valid Incidents search name in search field "Traffic"
    Then  user should be edit the Incidents search field
    Then  Enter the valid Incidents search name in search field "Heavy Traffic"
    Then  Verify the New search data should be displayed "Heavy Traffic"
    
    
    Scenario Outline: Verified the % sign in search keyword should not redirect to 404 ERROR
    Given open the valid url in Mapsynq APP
    Then  Enter the Htmls query in search field "<SearchNames>"
    Then  Verify no results found alert message should be display
    
     Examples: 
    | SearchNames          |        
    | <script>alert(1)</script> |
    
    
    Scenario Outline: Verify the  characters ,number and special character allowed to be entered into the search box.
    Given open the valid url in Mapsynq APP
    Then  Enter the Incidents search text field "<SearchNames>"
    Then  Verify the text and number should be displayed in Incidents search textbox"<SearchNames>"
   
   Examples: 
   | SearchNames          |                   
   | New Test location   |
   | 012345678901         |
   | !@%^&&*(**           |
   | ABCSDSDSD2342343242  |
   