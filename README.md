﻿# ClaimsManagmentSystem

Project Breakdown
 breaking down the project into small, manageable tasks. Here's an initial action plan:
Set up Spring Boot Project with dependencies.
Create the database schema with models (Customer, Claim, Administrator, Notification).
Create RESTful API for CRUD operations on Claims, Users, etc.
Build the frontend with Thymeleaf templates (Login, Sign Up, etc.).
Implement Spring Security for authentication and session management.
Style the frontend with responsive CSS (inline, internal, and external).
Write unit tests for the service and repository layers.
Deploy the application.

Tech Stack
Frontend:
HTML, CSS (with Thymeleaf for dynamic rendering)
JavaScript for client-side interactivity
Backend:
Spring Boot (Java framework)
Spring Security for authentication and role management
Database:
MySQL
Testing:
Mockito for unit testing and mocking
Version Control:
Git for source code management
Overview
The Insurance Claims Management System is a web application designed to allow customers to submit insurance 
claims online and enable administrators to process and manage those claims effectively. The system streamlines 
claim submission, updates, and notifications, enhancing communication between customers and administrators.
Features Customer Dashboard: Allows customers to submit claims, track claim statuses, and receive notifications.
Administrator Dashboard: Allows administrators to view, update claim statuses, and manage claim-related data.
Role-Based Access Control: Different access levels for Customer and Administrator roles, using Spring Security.
CRUD Operations: Full create, read, update, and delete functionality for managing users, claims, and notifications.
Database Integration: Data is stored in a MySQL database, ensuring secure and persistent storage of user and claim information.
