# Event Search and Ticket Recommendation System
* An interactive web application that help users to search and purchase nearby event tickets with personalized Recommendation Engine.
* Visted it at http://54.241.139.79/Jupiter/
* Test user name: test
*       password: 1234

## Update: May 26
* Added "Item.java" and "ItemBuilder" static class to get clean data from TicketMasterAPI.
* Added purify method in TicketMasterAPI.java to convert JSONArray to a list of items.
* Implemented some helper methods to fetch data fields(img URL, address, categories) which are included deeply in TicketMaster response body.

## May 26 - Aug 1 Update stopped due to school finals and summer class

## Update: Aug 2
* Supported MySQL database to capture event data from TicketMaster API.
* Added "MySQLTableCreation" class to automatically reset tables in database(prevent data messed up).
* Added "MySQLConnection" class to save search results to database.

## Update: Aug 6
* Implemented "Login" "Logout" servlet to support login and logout functions.

## Update: Aug 8 (Finally is completed)
* Supported content-based user favourite recommendation
* Supported new user registration function
* deployed to Amazon EC2 
