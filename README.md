# Event Search and Ticket Recommendation System
* Created Java servlets with RESTful APIs to handle HTTP requests and responses
* Built relational and NoSQL databases (MySQL, MongoDB) to capture event data (name, description, location, parking info)      from TicketMaster API
* Designed algorithms to improve event recommendation based on search history and favorite records) 
* Deployed server to Amazon EC2 to handle 150 queries per second tested by Apache JMeter. 

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
