#SOFTWARE-PROCESS-JAVAFX-PROJECT

This is a project work for the course title: SOFTWARE PROCESS (M09240) on Master studies submitted in the Department of Software Engineering and Computer Science, Faculty of Organisational Sciences, UNIVERSITY OF BELGRADE, SERBIA. It is my first project experience fully implemented using JavaFX-framework in java Programming Language. It is a desktop game application.

The following functions can be executed on the web page after successfully connecting and running the application:

Home DashBoard containing projects, employees, user accounts and you can view the list of projects, employees and real time chart for projects completed and in progress
Hr Manager/Admin can add new employees, update and perform other CRUD operations
Users can tract projects stages Real Time using the logical pie chart
Project manager can add projects and assign to employees
Error pages redirection configuration
Login and registration page for admins(Hr Manager, Project manager and main admin).
#DATABASE - CONNECTION PARAMETERS

I use postgresql, for data storage and manipulation,

I have created a database "projectmanager", and you can find the connection in the "Application dev-properties"

spring.datasource.url=jdbc:postgresql://localhost:5433/projectmanager

spring.datasource.username=postgres

spring.datasource.password=postgres

spring.datasource.initialization-mode=never

spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

I used PgAdmin to run a postgreSQL Server on my localhost.

#STARTING THE APPLICATION:

You can CLICK on the MAIN ProjectManagementApplication Class and run the entire project

Login to http://localhost:8080, explore the application home page to executes all the listed functions above

#TESTING THE APPLICATION

I USED J-UNIT TEST AND YOU CNA TEST THE APPLICATION BY RUNNING ALL THE UNITS OR ENTITIES/THEIR UNITS.

LICENSE

COPYRIGHT © 2022 ORBANJAMES.
