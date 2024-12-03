# Student Management System (MVC)

This project is a **Student Management System** that has been implemented in two versions:

1. **Java (MVC) Version**: A Java-based MVC architecture to manage student details, display class information, and calculate aggregated GPA details.
2. **Python (Django MVC) Version**: A Django web application that provides the same functionalities with a more modern web-based approach.

This repository provides both implementations and demonstrates how the MVC architecture can be implemented in both Java and Python.

## Features

- **Java Version**: 
  - Display individual student details (name, registration number, GPA, semester).
  - View the list of all students in a class.
  - View aggregated GPA details (maximum GPA, minimum GPA, and average GPA) for the class.
  
- **Django Version**:
  - Display individual student details using Django views and templates.
  - Show the list of students in a class.
  - Calculate and display aggregated GPA details (max GPA, min GPA, average GPA) for the class.
  - Admin interface for managing students and classes.

## Technologies Used

- **Java (MVC)**:
  - Java 8 or later.
  - JavaFX for the console-based interface.
  
- **Python (Django MVC)**:
  - Python 3.x
  - Django 4.x
  - SQLite (default database for Django)

## Setup Instructions

### Java (MVC Version)

1. **Clone the Repository**:
   Clone this repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/student-management-java-mvc.git
   cd student-management-java-mvc
Compile and Run:
Use any IDE (like IntelliJ IDEA or Eclipse) or the command line to compile and run the Java project.
The main entry point is the Main.java file, where you can see the individual student details, class details, and GPA aggregation in the console.
Django (MVC Version)
Clone the Repository: Clone this repository to your local machine:

bash
Copy code
git clone https://github.com/yourusername/student-management-django.git
cd student-management-django
Create a Virtual Environment: (Optional but recommended)

bash
Copy code
python -m venv venv
source venv/bin/activate  # For macOS/Linux
venv\Scripts\activate     # For Windows
Install Django: Install the required packages for the Django version:

bash
Copy code
pip install -r requirements.txt
Apply Migrations: Set up the database by running migrations:

bash
Copy code
python manage.py migrate
Create a Superuser: Create a superuser to access the Django admin panel:

bash
Copy code
python manage.py createsuperuser
Run the Server: Start the Django development server:

bash
Copy code
python manage.py runserver
You can now access the application in your browser at:

arduino
Copy code
http://127.0.0.1:8000/
Accessing the Django Application
Student Details: Visit /student/<student_id>/ to view individual student details. Replace <student_id> with the ID of the student.
Class Details: Visit /class/<class_id>/ to view the list of students in a specific class. Replace <class_id> with the ID of the class.
Aggregated GPA Details: Visit /class/<class_id>/aggregated/ to view aggregated GPA details for the class. Replace <class_id> with the ID of the class.
Admin Panel
To add, edit, or manage students and classes, use the Django Admin Panel:

Go to /admin/ in your browser.
Log in with the superuser credentials you created earlier.
From the admin panel, you can add students and classes.
Project Structure
Java (MVC Version)
Model: Contains the Student and Class classes.
View: Contains the StudentView class to display student and class details.
Controller: Contains the StdController class to manage student and class data and interact with the view.
Django (MVC Version)
Model: The Student and Class models are defined in models.py and are used to store and manage student data.
View: Views for rendering student details, class details, and aggregated GPA are defined in views.py.
Controller: Django views act as the controller in MVC, handling requests and passing data to templates.
Models
Java (MVC Version)
Student Model
name: Name of the student.
regNo: Registration number of the student.
gpa: GPA of the student.
semester: The semester the student is enrolled in.
Class Model
students: A list of students in the class.
getMaxGPA(): Method to get the highest GPA.
getMinGPA(): Method to get the lowest GPA.
getAvgGPA(): Method to get the average GPA.
Django (MVC Version)
Student Model
name: CharField to store the student's name.
reg_no: CharField for the registration number.
gpa: FloatField for the GPA.
semester: CharField for the semester.
Class Model
students: A many-to-many relationship with the Student model.
Methods to calculate the max, min, and average GPA for the class.
