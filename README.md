# Event Search and Ticket Recommendation System
* Created Java servlets with RESTful APIs to handle HTTP requests and responses
* Built relational and NoSQL databases (MySQL, MongoDB) to capture event data (name, description, location, parking info)      from TicketMaster API
* Designed algorithms to improve event recommendation based on search history and favorite records) 
* Deployed server to Amazon EC2 to handle 150 queries per second tested by Apache JMeter. 

## Update: May 26
* Added "Item.java" and "ItemBuilder" static class to get clean data from TicketMasterAPI.
* Added purify method in TicketMasterAPI.java to convert JSONArray to a list of items.
* Implemented some helper methods to fetch data fields(img URL, address, categories) which are included deeply in TicketMaster response body.
