Open close Principle

Open Close Principle (OCP) states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

*Problem Statement*
- You are building a notification module for a large-scale banking/fintech application. The app needs to send alerts to users via multiple channels such as:

📧 Email

📱 SMS

📲 Push Notification

💬 WhatsApp

🔔 Slack (later)

Today, your system only supports Email and SMS. But later you’ll have to support more channels — without modifying the existing code.

Liskov substitution principle

- Liskov substitution principle (LSP) states that objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
- Subclasses should be able to substitute for their base classes.
- The base class should be a generalization of the subclass.
- Child class should not need special treatment. 



Interface Segregation Principle

- Interface Segregation Principle (ISP) states that no client should be forced to depend on methods it does not use.
- Separate interfaces for related functionality is a good idea.
- If we are not following ISP it could lead to class explosion in many cases.




Problem Statement: "Smart Home Device Control System"
🏡 Context:
You are building a smart home automation platform that supports different types of smart devices, such as:

💡 Smart Light

🪟 Smart Curtain

📺 Smart TV

📷 Smart Camera

🔐 Smart Door Lock

Each device supports different functionalities, like:

Turn on/off

Play media

Rotate camera

Adjust brightness

Lock/unlock

Open/close



- ***HomeWork***

Assignment: Implement a Custom Query Builder

Background

In many applications, especially those involving databases, constructing complex queries dynamically is a common requirement. Your task is to implement a Query Builder class for a SQL-like database using the Builder pattern. This Query Builder should be flexible enough to handle various types of queries with different selections, conditions, joins, and other SQL features.

Requirements

1.	Basic Query Structure:
      •	The Query Builder should at least support SELECT, FROM, WHERE, JOIN (INNER and LEFT), ORDER BY, and GROUP BY clauses.
      •	It should allow chaining methods in any order to build the query.
2.	Type Safety and Validation:
      •	Include validation to ensure that essential parts of the query (like SELECT and FROM) are present.
      •	If a part of the query is missing or invalid (e.g., ordering by a column not in select), the builder should throw an error or handle it gracefully.
3.	Flexibility:
      •	The builder should be flexible enough to allow for different kinds of inputs (e.g., multiple columns in select, various conditions in where).
4.	Immutability:
      •	Ensure that once a query is built, it cannot be modified.
5.	Test Cases:
      •	Write test cases demonstrating the use of the Query Builder for different scenarios (e.g., a simple query, a complex query with joins and aggregations).
6.	Documentation:
      •	Document the usage of your Query Builder with examples.
7.	Bonus - Fluent API:
      •	Implement the builder with a fluent API style, allowing calls to be chained in a readable manner.
      Example Usage

String query = new QueryBuilder()
.select("name", "age")
.from("users")
.where("age > 30")
.orderBy("name")
.build();
Evaluation Criteria

•	Correct implementation of the Builder pattern.
•	Code quality, including readability, maintainability, and adherence to language-specific idioms.
•	Proper validation and error handling.
•	Comprehensive test coverage demonstrating different use c

