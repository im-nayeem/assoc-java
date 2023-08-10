# Student Association Management System

The **Student Association Management System** is a comprehensive web application built for the management of student associations within institutions like universities. This application, developed using Java EE, JSP, HTML, CSS, JavaScript, and MySQL, offers a suite of features to facilitate seamless communication and organization among association members, administrators, advisors, and alumni.

## Key Features

- **User Roles:** The application supports three user roles: Common Members, Advisors, and Admins.
- **Registration:** New association members can easily register by providing their essential information.
- **Email Verification:** To ensure authenticity, the application uses `Google SMTP Server` for `OTP`-based `email verification`.
- **Admin Approval of Registered Members:** Upon member registration, the admin (part of the executive committee) reviews the submitted information and approves or rejects membership requests.
- **Executive Committee Management:** Admins can add, update, and delete executive committee members from the pool of registered association members.
- **Advisor Addition:** Admins have the authority to include advisors in the association. Advisors receive a `confirmation link via email` to set up their `advisor accounts` by providing `password` and other necessary information.
- **Alumni Management:** Admins can manage alumni members, providing control over their addition, modification, or removal.
- **News, Notices, and Event Details:** Admins can share important updates, notices, and event information with registered members and advisors. 
- **Exclusive Access:** Registered members and advisors gain access to the application's news, notices, event details, and association gallery after `logging in`.
- **Enhanced Security:** The application employs `password hashing` with random `salts` to ensure robust authentication security.

## Tools and Technology:
- Java EE
- HTML, CSS, JavaScript
- Maven
- Tomcat-9
- IntelliJ IDEA

## Getting Started

Follow these steps to get the project up and running on your local machine:

1. **Prerequisites:** Make sure you have Java, MySQL, Tomcat 9, and an Integrated Development Environment (IDE) like IntelliJ IDEA installed.
2. **Fork or Download this Repository:** Fork this repository and clone to your local machine or download the zip file of this repository and extract on yout local machine. Then navigate to the `web_app` folder which contains the application.
4. **Database Setup:** Import the MySQL database schema provided in this repository as assoc.sql file.
5. **Google SMTP Settings:** Generate your Gmail app password to use the Google SMTP server to send `OTP` for `email verification`. [Click here](https://support.google.com/mail/answer/185833?hl=en) to see how to generate an app password.
6. **Configuration:** Configure your MySQL credentials in the `dbConfig.properties` file in the resource folder of the project.
7. **Deployment:** Deploy the application on Tomcat 9 using your IDE or manual deployment.
8. **Initialize the Application:** Open the application admin-panel in your browser by navigating to `http://localhost:8080/{application-name}/admin-panel` and provide the necessary information for the first time by login to the admin-panel.`[ Use email: admin@assoc.com and password: pass#admin for the first time and then change this later.]`
## Schema Diagram
![Schema](https://github.com/im-nayeem/assoc-java/assets/77660934/32dc59ef-e0a0-4ef4-b72b-b751bdf26e79)
## Screenshots
### Homepage
![Homepage](https://github.com/im-nayeem/assoc-java/assets/77660934/a12e2f9e-70b3-4dbb-aff3-cfffed05a92c)
### Member Registration
![registration](https://github.com/im-nayeem/assoc-java/assets/77660934/096e2f26-9c25-4e42-8154-34eb9ef6a44e)
### Email Verification by OTP
![email verification](https://github.com/im-nayeem/assoc-java/assets/77660934/d630b5a9-6403-4e95-874c-66b0ca67eecd)
### Admin Approval of Newly Registered Member
![admin approval](https://github.com/im-nayeem/assoc-java/assets/77660934/0bf8b69a-edb3-46a9-a6d0-66be74f1836d)
### Profile Dashboard
![profile dashboard](https://github.com/im-nayeem/assoc-java/assets/77660934/c7eafc49-b815-4326-b2d9-5305aa47dc3b)
### Members
![Members](https://github.com/im-nayeem/assoc-java/assets/77660934/5417ac19-2a59-4b74-91c6-92e689df5331)
### Executive Committee
![Executive Committee](https://github.com/im-nayeem/assoc-java/assets/77660934/42cf228b-78aa-4cbe-905a-8c66d7e35229)
### Gallery
![gallery](https://github.com/im-nayeem/assoc-java/assets/77660934/cec76d4f-cc1e-4d99-830e-aba699a04568)
### Admin Panel
![admin panel](https://github.com/im-nayeem/assoc-java/assets/77660934/d6c46f29-12cf-43c6-836b-bf13748aafa6)
### Manage Committe and Alumni from Existing Members
![manage members](https://github.com/im-nayeem/assoc-java/assets/77660934/091c5086-541c-4fbc-9589-aeecd7f91d9a)
### Managing Executive Committee
![add committee](https://github.com/im-nayeem/assoc-java/assets/77660934/24e55486-d7d0-42e3-912e-eba2b9e2f368)
![update committe](https://github.com/im-nayeem/assoc-java/assets/77660934/c4ffc553-b723-4c9c-b854-97ac11ebc9d5)
### Managing Advisor
![add advisor](https://github.com/im-nayeem/assoc-java/assets/77660934/576ace43-d72f-4de4-bff6-de0e737120ff)
![new advisor](https://github.com/im-nayeem/assoc-java/assets/77660934/84bb6043-f9c8-4bed-b7e1-b170310fe3b2)
### Add Notice
![image](https://github.com/im-nayeem/assoc-java/assets/77660934/71f864e4-3fbe-4655-8e6e-449a358a8776)
![image](https://github.com/im-nayeem/assoc-java/assets/77660934/2f00c206-556b-4f91-b4c6-73b8d62aad9a)





