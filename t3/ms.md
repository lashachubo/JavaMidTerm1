# Messaging Management System (MMS)

## Description

The **Messaging Management System (MMS)** is a Java-based system for managing messages between users. It provides functionalities to send, receive, delete, and print messages, along with a feature to search messages based on a keyword.

### Features:

1. Storage for messages.
2. Ability to send a message.
3. Ability to delete a message.
4. Ability to print the message history.
5. **New Feature**: Search messages by keyword.

## MMS Structure

The system consists of three main classes:

1. **Message** – Represents a single message with fields like sender, receiver, content, and timestamp.
2. **MMS** – Manages messages, allowing for sending, deleting, and printing messages.
3. **MMSManager** – The main class to test the system by simulating sending, deleting, and searching messages.

## Class: Message

The `Message` class represents an individual message in the system.

### Fields:

- `sender`: The sender of the message.
- `receiver`: The receiver of the message.
- `content`: The content of the message.
- `timestamp`: The timestamp when the message was sent.

## Class: MMS

The `MMS` class manages the messages, allowing users to send, delete, and print messages.

### Methods:

- `sendMessage(Message message)`: Adds a message to the system.
- `deleteMessage(Message message)`: Removes a message from the system.
- `printMessages()`: Prints all the messages in the system.
- **New Feature**: `searchMessages(String keyword)`: Searches for messages containing a specific keyword in their content.

## Class: MMSManager

The `MMSManager` is the test class where the system is used to simulate the sending, deleting, and searching of messages.

## New Feature: Search Messages

The **searchMessages** method allows users to search for messages that contain a given keyword. This feature prints all the messages that include the keyword in their content.
