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


