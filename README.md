#SOFTWARE-PROCESS-JAVAFX-PROJECT(MINESWEEPER)

This is a project work for the course title: SOFTWARE PROCESS (M09240) on Master studies submitted in the Department of Software Engineering and Computer Science, Faculty of Organisational Sciences, UNIVERSITY OF BELGRADE, SERBIA. It is my first project experience fully implemented using JavaFX-framework in java Programming. Minesweeper is a single-player logic-based computer game played on a rectangular board whose object is to locate a predetermined number of randomly placed "mines" in the shortest possible time by clicking on "safe" squares while avoiding the squares with mines.
The objective of this game/application is to clear a rectangular board containing hidden “mines” or bombs without detonating any of them, with help from clues about the number of neighboring mines in each field.
To play the game, you need to reset the board (define the height, the width, and the number of mines) so that the solution does not require guessing. players may elect to replay a board, in which the game is played by revealing squares of the grid by clicking or otherwise indicating each square. If a square containing a mine is revealed, the player loses the game. If no mine is revealed, a digit is instead displayed in the square, indicating how many adjacent squares contain mines; if no mines are adjacent, the square becomes blank, and all adjacent squares will be recursively revealed. The player uses this information to deduce the contents of other squares and may either safely reveal each square or mark the square as containing a mine.

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
