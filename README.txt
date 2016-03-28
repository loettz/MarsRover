Mars Rover - Lotte Hansen

Java Version: 8

INSTRUCTIONS:
To run the code start the main method in the Main class.
The program requires a textfile with the input data and 
as soon as you run the code the console will ask for a path to get the input data.
(A textfile with the test input is available in the test folder.)
The output will be displayed in the console.

EXPLANATION:

For the Mars Rover Scenario there is a Plateau class and a MarsRover class.
A Plateau object is defined by its upper right coordinates.
A MarsRover object has a location, a direction and the plateau where the rovers have landed on.

The Location class has two ints as x- and y coordinates.

The enum Direction contains 4 directions (north, south, east, west).
The next function in direction gets the next direction clockwise by its ordinal.
The previous function does the same thing the other way round.
These functions are easy expandable if the rover should be able to go diagonal.
The Direction also has the function possibleMoves to get a number of possible Rover moves
based on Location and Plateau. This function helps to make sure that the MarsRover stays in the grid.

Because the Mars Rover problem requires input there is
a ReadInput class to reach the input data via textfile.
The class can read a textfile and create an array with the lines of the file.

The RoverDataParser class takes the array from the ReadInput class and generates
a Plateau with the first element in the array(first line of input).
The class also generates an array with every Rover from the input and creates 
Mars Rover objects. 

The enum RoverMotion contains the 3 RoverMotions that are found in the input
an processes the String from the input to an array of RoverMotions so
every Movement of the Rover can be executed 
successively from the array.



