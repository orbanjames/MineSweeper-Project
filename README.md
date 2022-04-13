#SOFTWARE-PROCESS-JAVAFX-PROJECT(MINESWEEPER)

This is a project work for the course title: SOFTWARE PROCESS (M09240) on Master studies submitted in the Department of Software Engineering and Computer Science, Faculty of Organisational Sciences, UNIVERSITY OF BELGRADE, SERBIA. It is my first project experience fully implemented using JavaFX-framework in java Programming. Minesweeper is a single-player logic-based computer game played on a rectangular board whose object is to locate a predetermined number of randomly placed "mines" in the shortest possible time by clicking on "safe" squares while avoiding the squares with mines.

The objective of this game/application is to clear a board containing hidden “mines” or bombs without detonating any of them, with help from clues about the number of neighboring mines in each field.

To play the game, you need to reset the board (define the height, the width, and the number of mines) so that the solution does not require guessing. players may elect to replay a board, in which the game is played by revealing squares of the grid by clicking or otherwise indicating each square. If a square containing a mine is revealed, the player loses the game. If no mine is revealed, a digit is instead displayed in the square, indicating how many adjacent squares contain mines; if no mines are adjacent, the square becomes blank, and all adjacent squares will be recursively revealed. The player uses this information to deduce the contents of other squares and may either safely reveal each square or mark the square as containing a mine.

ONE OF THE GAME-BOARD IMAGES (Height=15, Width=15, Mines=15)
![img_1.png](img_1.png)

#DATABASE - CONNECTION PARAMETERS

I use postgresql, for data storage and manipulation,

I have created a database "minesweeper", and you can find the connection in the "UserAccount"

String url = "jdbc:postgresql://localhost:5433/minesweeper";

String user = "postgres";

String password = "postgres";

I used PgAdmin to run a postgreSQL Server on my localhost.

#STARTING THE APPLICATION:

To start the Game/application, right-click on the Main Class and the select the Run 'Main-main()' and the Game main board will display on your desktop, thereafter, set the height, the width and the number of mines according to your preferred size of the rectangular game board, which also shows how simple or hard the game will be. the more the number of mines reset, the difficult  the game is to win.





LICENSE

COPYRIGHT © 2022 ORBANJAMES.
