**Project 1: Simple Console Application - Contact Management**

**Goal:** Mastering the fundamental concepts of the Java language.

* **Description:** This is a basic console application designed to help users manage a simple list of contacts. It provides essential functionalities for interacting with contact information directly from the command line. Users can **add new contacts** by providing their first name, last name, phone number, and email address. The application allows users to **remove existing contacts** from the list. It also includes a **search feature** that enables users to find contacts based on either their first or last name. Finally, users can **display a list of all currently stored contacts**. The contact data is held in the application's memory and will be lost once the application is closed. This project serves as an excellent starting point to learn fundamental Java concepts and object-oriented programming principles.
* **Key Concepts to Learn/Apply:**
    * Basic Java syntax (variables, data types, operators).
    * Control structures (if-else, switch, for loops, while loops).
    * Fundamentals of Object-Oriented Programming (OOP):
        * Classes and objects (e.g., `Contact` class).
        * Constructors.
        * Methods (getters, setters, `toString()`, `equals()`, `hashCode()` methods).
        * Encapsulation.
    * Collections: `ArrayList` or `LinkedList` for storing contacts.
    * Handling console input/output (`Scanner`, `System.out.println`).
    * Basic exception handling (`try-catch`).
* **Requirements:**
    * Create a `Contact` class with fields: `firstName`, `lastName`, `phoneNumber`, `email`.
    * Create a main application class with a `main` method.
    * Implement a console menu allowing the selection of an action (add, delete, find by first/last name, display all, exit).
    * Use `ArrayList<Contact>` to store data.
    * Basic input data validation (e.g., checking if the phone number is not empty).
    * Code organized into logical methods.
    * Project managed by Maven (a simple `pom.xml` for now without external dependencies other than JUnit).
    * Write a few simple unit tests (JUnit) for the `Contact` class (e.g., test `equals`/`hashCode`).
* **Technologies:** Java SE (JDK), Maven, JUnit.
* **Possible Future Enhancements:**
    * **Saving and Loading Data:** Implement functionality to save the contact data to a file (e.g., CSV, text file) so that it persists between application runs, and to load this data when the application starts.
    * **Searching by Other Fields:** Extend the search functionality to allow searching by phone number or email address.
    * **Editing Contacts:** Add the ability to modify the details of an existing contact.
    * **Sorting Contacts:** Implement sorting of contacts by name or other criteria.
    * **More Robust Input Validation:** Implement more comprehensive validation rules for the input data (e.g., email format validation, phone number format validation).
    * **User Interface:** In the future, this console application could be expanded into a graphical user interface (GUI) application for a more user-friendly experience.
