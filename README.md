# Java_Hotel_Management_System
The Hotel Management System is a desktop-based Java application designed to streamline and automate the management of clients, rooms, and reservations. This project combines the power of Java Swing for a user-friendly graphical interface and MySQL for robust data storage and manipulation. 
It is an ideal solution for small to medium-sized hotels seeking efficient room allocation, reservation tracking, and client management.

Features
Client Management

Add, update, and delete client records.
Store essential client details such as name, contact information, and identification details.
Search functionality to quickly locate client information.
Room Management

Maintain a comprehensive list of rooms with details like room number, type (single, double, suite), price, and availability status.
Real-time update of room availability based on reservations.
Reservation Management

Book, modify, and cancel reservations.
Ensure data integrity using a foreign key relationship between the Rooms and Reservations tables.
Automatically update the room’s status to "Reserved" upon successful reservation and revert it to "Available" upon cancellation.
Interactive GUI

Developed using Java Swing, the application provides a clean and intuitive interface.
Features include dropdown menus, tables for data visualization, and forms for input.
Responsive design for better user experience.
Database Design
Tables

Clients Table: Contains client details such as ID, name, phone number, and email.
Rooms Table: Tracks room attributes like room number, type, price, and reservation status.
Reservations Table: Stores reservation details including reservation ID, client ID, room number (foreign key), check-in and check-out dates, and payment status.
Relationships

Rooms Table is linked to the Reservations Table via a foreign key (room_number).
Updates in the Reservations Table automatically reflect in the Rooms Table to indicate real-time room status.
Technologies and Tools
Programming Language: Java (with focus on Object-Oriented Programming principles).
Graphical Interface: Java Swing for interactive and user-friendly GUI.
Database Management: MySQL for storing and querying data.
JDBC (Java Database Connectivity): For seamless integration between Java and MySQL.
Functional Workflow
Login Screen:

Secure access to the application using role-based authentication.
Dashboard:

Centralized view with options to manage clients, rooms, and reservations.
Room Management:

View all rooms and their statuses.
Add new rooms or modify details of existing rooms.
Reservation Management:

Book a room by selecting a client and a room from the list.
Automatically update the room’s status in the database upon booking.
Cancel reservations and free up the room in real-time.
Client Management:

Add or modify client details and view past reservations.
Additional Features
Validation and Error Handling: Ensure consistent data entry and provide feedback for incorrect inputs.
Search and Filtering: Quickly locate rooms, reservations, or client information using advanced search functionalities.
Reports: Generate and export summaries of reservations, available rooms, and client histories for management review.
Target Users
This system is designed for hotel administrators, receptionists, and management staff to enhance operational efficiency and improve customer satisfaction.

This project exemplifies a practical application of Java programming and MySQL database design while emphasizing real-world problem-solving and modular software development.






