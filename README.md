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
![Schema Diagram](https://github.com/im-nayeem/assoc-java/assets/77660934/35cdb913-3779-4f19-b012-eb66faf1110d)
## Screenshots
### Homepage
![Homepage](https://github.com/im-nayeem/assoc-java/assets/77660934/6f4de73d-cd25-4310-a42b-8b44222ee7cc)
### Member Registration
![Registration](https://github.com/im-nayeem/assoc-java/assets/77660934/df79e0a8-7558-47c4-a791-a8e88675ef53)
### Email Verification by OTP
![email verification](https://github.com/im-nayeem/assoc-java/assets/77660934/809a9cff-4e8c-441f-a3ee-d08328ef5d12)
### Admin Approval of Newly Registered Member
![admin approval](https://github.com/im-nayeem/assoc-java/assets/77660934/967550ae-b163-440c-a027-7405efe2887e)
### Profile Dashboard
![Profile Dashboard](https://github.com/im-nayeem/assoc-java/assets/77660934/a1ce1299-71bd-4a1c-ac2b-912523e92a73)
### Members
![Members](https://github.com/im-nayeem/assoc-java/assets/77660934/02a59223-cf79-42ce-b99e-b8b6774250ee)
### Executive Committee
![executive committee](https://github.com/im-nayeem/assoc-java/assets/77660934/695eb564-9f16-49ff-a4a4-983a5f842c04)
### Gallery
![image](https://github.com/im-nayeem/assoc-java/assets/77660934/6cbc60f8-8278-4d69-836b-ef6008026d34)
### Admin Panel
![Admin Panel](https://github.com/im-nayeem/assoc-java/assets/77660934/da22d4d8-333d-49df-abd7-f8cef3b75c8f)
### Adding Executive Committee
![adding executive committe](https://github.com/im-nayeem/assoc-java/assets/77660934/3aed826e-45ff-49fc-8034-f2033d42971f)
![image](https://github.com/im-nayeem/assoc-java/assets/77660934/3f857fcb-1fcf-4d16-87c4-ad2b5af2417b)
![update committee](https://github.com/im-nayeem/assoc-java/assets/77660934/0193dc46-51ff-4650-9742-3bb0fc2c9e73)
![image](https://github.com/im-nayeem/assoc-java/assets/77660934/c3dfddd0-714d-48d8-b350-cb5898fb798f)
![image](https://github.com/im-nayeem/assoc-java/assets/77660934/4cc45847-c63a-4905-88d7-7f2883639690)
![image](https://github.com/im-nayeem/assoc-java/assets/77660934/76da2c97-2aef-42a9-b9e8-9c09d0f1b30a)
![image](https://github.com/im-nayeem/assoc-java/assets/77660934/61c21787-d9aa-49f6-b76d-ffc38ae3ed49)





