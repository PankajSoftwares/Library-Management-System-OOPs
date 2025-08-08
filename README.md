
Project Details
Name: Library Management System
Type: Console-based application
Purpose:

Manage library books

Register members

Track loans (borrowed and returned books)

Tools Used
Programming Language: Java (commonly used for OOP and console applications)

IDE: VS Code, Eclipse, or NetBeans

Build tools: Not mandatory for this simple console app, but Maven/Gradle can be used for larger scale

Terminal/Command Prompt for running the program

Project Structure
text
LibraryManagementSystem/
│
├── src/
│   ├── Library.java         # Main system class
│   ├── Book.java            # Book class
│   ├── Member.java          # Member class
│   ├── Loan.java            # Loan class to track borrowed books
│   └── Main.java            # Main class to run the console app
│
└── README.md
System Design (Core Classes & Relationships)
Classes
Book

Attributes: bookId, title, author, isAvailable

Methods: getters/setters, display info

Member

Attributes: memberId, name, contactInfo

Methods: register, display info

Loan (uses encapsulation)

Attributes: loanId, book, member, loanDate, dueDate, isReturned

Methods: borrowBook, returnBook, display loan status

Library (main controller)

Attributes: collections of books, members, loans

Methods: add/remove book, register member, borrow book, return book, list books/members/loans

OOP Concepts Used
Inheritance: You could extend the Member class for different member types (e.g., Student, Staff) with specific borrowing limits.

Polymorphism: Methods like displayInfo() can be overridden in subclasses to show specific details.

Encapsulation: Private fields with public getters/setters to protect object states.

Abstraction: Library class abstracts core system operations away from user interface code.

Commands to Create Folders and Files (in terminal/command prompt)

mkdir LibraryManagementSystem
cd LibraryManagementSystem
mkdir src
cd src
touch Book.java Member.java Loan.java Library.java Main.java


To compile and run the Library Management System from the project root directory (LibraryManagementSystem), use the following commands:

Compile all Java files:
javac src/*.java

Run the application:
java -cp src Main