#Command Pattern
The command pattern is a type of behavioural design pattern that transforms a request into a stand-alone object containing all the details about the request.

This pattern is a data-driven pattern because we make use of the information about the request by wrapping it as an object and is passed to the invoker object as a command.

The invoker object checks for the object that can handle the command and passes it to that object to execute the command.

Example:

Remote Control that has one control button --> This single button can be used to control tubelight and radio both. The command to control these objects will be implemented using command design pattern.

Steps
1. Create Command Interface -> +execute:void
2. Tubelight class and it's command classes that will implement command interface
3. Create Radio class and it's command classes that will implement command interface
4. Create a remote control class that has only one button and and on click of button executes command.
5. Create Driver class to -> turn on the tubelight, then turn on radio and then set volume of radio to 4 and then turn off the tubelight.