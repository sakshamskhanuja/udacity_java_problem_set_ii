public class Main {
    public static void main(String[] args) {
        /*
         * Question 1
         *
         * Assume you have access to two boolean variables, isSnowing, and isRaining, and one double variable,
         * temperature. isSnowing is true when it's snowing and false otherwise, isRaining is true when it's raining
         * and false otherwise, and temperature gives the outdoor temperature in degrees Fahrenheit. Write code that
         * prints "Let's stay home." if it's raining, snowing, or below 50 degrees Fahrenheit (10 degrees Celsius),
         * and prints "Let's go out!" otherwise.
         *
         * Starting code:
         */
        // Assume these can have any value:
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isRaining || isSnowing || temperature < 50) {
            System.out.println("Let's stay home");
        } else {
            System.out.println("Let's go out!");
        }

        /*
         * Question 2
         *
         * Assume you have access to a double variable called time. Write code that assigns a different value to the
         * String variable timeOfDay based on the value of time in hours. If time is between 5 and 12, including 5 but
         * not including 12, set timeOfDay to "morning". If time is between 12 and 20, including 12 but not including
         * 20, set timeOfDay to "daytime". Finally, if the time variable does not satisfy either condition, set
         * timeOfDay to "night".
         *
         * Starting code:
         */
        // Assume this could have any value between 0 and 24:
        int time = 18;
        String timeOfDay;

        if (time >= 5 && time < 12) {
            timeOfDay = "morning";
        } else if (time >= 12 && time < 20) {
            timeOfDay = "daytime";
        } else {
            timeOfDay = "night";
        }

        /*
         * Question 3
         *
         * Assume you have access to an integer variable called dayOfTheWeek and a boolean variable called holiday,
         * which is true when it is a holiday and false on normal days. Write Java code that prints "Wake up at 7:00"
         * on weekdays that are not holidays, and prints "Sleep in!" on weekends and holidays. For the variable
         * dayOfTheWeek, use this key:
         * 1 = Monday
         * 2 = Tuesday
         * 3 = Wednesday
         * 4 = Thursday
         * 5 = Friday
         * 6 = Saturday
         * 7 = Sunday
         *
         * Starting code:
         */
        // Assume these could have any value:
        int dayOfTheWeek = 5;
        boolean holiday = false;

        if (dayOfTheWeek >= 1 && dayOfTheWeek <= 5 && !holiday) {
            System.out.println("Wake up at 7:00");
        } else {
            System.out.println("Sleep in!");
        }

        /*
         * Question 4
         *
         * Assume the int variable dayOfWeek has some value, and that it follows this rule:
         * 1 = Monday
         * 2 = Tuesday
         * 3 = Wednesday
         * 4 = Thursday
         * 5 = Friday
         * 6 = Saturday
         * 7 = Sunday
         *
         * Declare a String variable called schedule and write a switch statement that gives schedule a different value
         * based on the day of the week. For Monday, give it the value "Gym in the morning." For Tuesday give it the
         * value "Class after work." For Wednesday, give it the value "Meetings all day." For Thursday give it the
         * value "Work from home." For Friday, give it the value "Game night after work." For Saturday and Sunday, give
         * it the value "Free!" This should also be the default value.
         *
         * OR (optional): decide what to assign schedule for each day based on your own weekly schedule!
         *
         * Starting code:
         */
        // Assume this can have any value from 1 to 7:
        int dayOfWeek = 1;
        String schedule;

        switch (dayOfWeek) {
            case 1 -> schedule = "Gym in the morning";
            case 2 -> schedule = "Class after work";
            case 3 -> schedule = "Meeting all day";
            case 4 -> schedule = "Work from home";
            case 5 -> schedule = "Game night after work";
            default ->  schedule = "Free!";
        }
    }
}