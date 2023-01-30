## Problem Set

### Question 1

Assume you have access to two boolean variables, ```isSnowing```, and ```isRaining```, and one double variable, ```temperature```. ```isSnowing``` is ```true``` when it's snowing and ```false``` otherwise, ```isRaining``` is ```true``` when it's raining and ```false``` otherwise, and ```temperature``` gives the outdoor temperature in degrees Fahrenheit. Write code that prints "Let's stay home." if it's raining, snowing, or below 50 degrees Fahrenheit (10 degrees Celsius), and prints "Let's go out!" otherwise.

Starting code:

```
// Assume these can have any value:
boolean isSnowing = false;
boolean isRaining = true;
double temperature = 60.0;
```

### Question 2

Assume you have access to a double variable called ```time```. Write code that assigns a different value to the String variable ```timeOfDay``` based on the value of ```time``` in hours. If ```time``` is between 5 and 12, including 5 but not including 12, set ```timeOfDay``` to "morning". If time is between 12 and 20, including 12 but not including 20, set ```timeOfDay``` to "daytime". Finally, if the time variable does not satisfy either condition, set ```timeOfDay``` to "night".

Starting code:

```
// Assume this could have any value between 0 and 24:
int time = 18;
String timeOfDay;
```

### Question 3

Assume you have access to an integer variable called ```dayOfTheWeek``` and a boolean variable called ```holiday```, which is true when it is a holiday and false on normal days. Write Java code that prints "Wake up at 7:00" on weekdays that are not holidays, and prints "Sleep in!" on weekends and holidays. For the variable ```dayOfTheWeek```, use this key:

1 = Monday<br>
2 = Tuesday<br>
3 = Wednesday<br>
4 = Thursday<br>
5 = Friday<br>
6 = Saturday<br>
7 = Sunday

Starting code:

```
// Assume these could have any value:
int weekday = 5;
boolean holiday = false;
```

### Question 4

Assume the int variable ```dayOfWeek``` has some value, and that it follows this rule:

1 = Monday<br>
2 = Tuesday<br>
3 = Wednesday<br>
4 = Thursday<br>
5 = Friday<br>
6 = Saturday<br>
7 = Sunday

Declare a String variable called ```schedule``` and write a switch statement that gives schedule a different value based on the day of the week. For Monday, give it the value "Gym in the morning." For Tuesday give it the value "Class after work." For Wednesday, give it the value "Meetings all day." For Thursday give it the value "Work from home." For Friday, give it the value "Game night after work." For Saturday and Sunday, give it the value "Free!" This should also be the default value.

OR (optional): decide what to assign schedule for each day based on your own weekly schedule!

Starting code:

```
// Assume this can have any value from 1 to 7:
int dayOfWeek = 1;
```
