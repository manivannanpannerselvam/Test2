@Maps_Functionality
Feature: verify the MapSynq_Zoom_In_Zoomout functionality

 
  Scenario: Verify the Maps in Zoom in and zoom Out 
    Given open the valid Map url in Mapsynq APP
    Then  click the Zoom in in Map field
    Then  click the map menu icon 
    Then  click the Zoom out in Map field
    
    Scenario: Verify the Maps link 
    Given open the valid Map url in Mapsynq APP
    Then  click the Image in Google Map 
    Then  Verify the Map link 
    
    Scenario: Verify the Live Tolls Name list 
    Given open the valid Map url in Mapsynq APP
    Then  click the Tolls icon
    Then  Enter the valid Tolls name "Anson Road"
    Then  click the map menu icon 
    Then  click the Anson Road link 
    
    