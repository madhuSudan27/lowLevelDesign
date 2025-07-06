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
- 