/**
 * Constructs a Rohan object.
 */
public class Rohan {

    /** Rohans age */
    public String age;
    /** Rohans college */
    public String school;
    /** Rohans school mascot */
    public String mascot;
    /** Rohans favorite sport */
    public String favSport;

    /**
     * Constructor for a Rohan object. Consctructs object by calling setter methods.
     *
     * @param school School Rohan attends
     * @param date Todays current date used to calculate Rohans age
     * @param mascot The mascot of Rohans school
     * @param sport Rohans favorite sport
     * @throws RohanException If school or sport is wrong.
     */
    public Rohan(String school, String date, String mascot, String sport) throws RohanException {
        setSchool(school);
        setAge(date);
        setMascot(mascot);
        setSport(sport);
    }
    
    /**
     * Sets the school variable to the parameter, if the parameter is correct.
     *
     * @param School Rohans School
     * @throws RohanException If school does not equal USC and school does
     *         not equal UofSC and school does not equals The University of South Carolina.
     *         Capitalization is ignored. Passes a custom exception message.
     * @throws NullPointerException if the parameter is null.
     */
    public void setSchool(String school) throws RohanException {
        if (!school.equalsIgnoreCase("USC") && !school.equalsIgnoreCase("UofSC") && !school.equalsIgnoreCase("The University of South Carolina")
            && !school.equalsIgnoreCase("University of South Carolina") && !school.equalsIgnoreCase("South Carolina")) {
            String ex = "Rohan doesn't attend \"" + school + "\"!";
            throw new RohanException(ex);
        }

        if (school == null) {
            throw new NullPointerException("School cannot be null.");
        }

        this.school = school;

    }

    /**
     * Returns rohans school.
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets school mascot.
     * @param Mascot Mascot of school to be set.
     * @throws NullPointerException If parameter is null.
     */
    public void setMascot(String mascot) {
        if (school == null) {
            throw new NullPointerException("School cannot be null.");
        }

        this.mascot = mascot;
    }

    /**
     * Returns school mascot. If "cock" is a substring of the mascot string
     * the string " (lol)" is appended to the end of the string
     */
    public String getMascot() {
        if (mascot.toLowerCase().contains("cock")) {
            mascot += " (lol)";
        }

        return mascot;
    }


    /**
     * Accepts a date as a string
     * Splits the date into a list of strings formatted as {"month", "date", "year"}
     * Iterates through the list of dates and populates a new list called "dates" with the values as integers.
     * Throws exceptions if dates are incorrect.
     * Creates int array of months and the number of days in each month. Index 0 is set to 0 to make things easier.
     * Int array called "rohansBirthDay" is created where index 0 is the month, idx 1 is the day, and idx 2 is the year.
     *
     * For loop starts at the month after Rohans birth month. Stops iterating before the month in the current date. Adds
     * all days in between May and the month before the month of the current date. The "days" variable keep tracks on the number of days.
     *
     * After for loop terminates, The number of days in the current date are added to the number of days left in April after Rohans
     * birthday has occured.
     *
     * The program than adds the years Rohans been alive with the number of days divided by 365 to calculate Rohans age and stores
     * the value in an integer value called "almostFinalAge"
`    *`
     * The value of "almostFinalAge" is then rounded to two decimal places and stored in a string variable called "theAge"
     *
     * The variable "theAge" is then returned.
     *
     * @param date Todays date formatted as MM/DD/YYYY
     * @throws IllegalArgumentException If month is greater than 12 or less than or equal to 0.
     * @throws IllegalArgumentException If day is greater than 31 or less than or equal to 0.
     * @throws IllegalArgumentException If year is greater than 2022 or less than or equal to 2002.
     * @returns Rohans age as a string.
     */
    private static String calcAge(String date) {

        String[] theDates = date.split("/");

        int[] dates = new int[3];

        for (int i = 0; i < theDates.length; i++) {
            dates[i] = Integer.parseInt(theDates[i]);
        }

        if (dates[0] > 12 || dates[0] <= 0) {
            throw new IllegalArgumentException("Month in date is wrong ");
        }

        if (dates[1] > 31 || dates[1] <= 0) {
            throw new IllegalArgumentException("Day in date is wrong ");
        }

        if (dates[2] > 2022 || dates[2] <= 2002) {
            throw new IllegalArgumentException("Year in date is wrong. Rohan wasn't alive!");
        }

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] rohansBirthDay = {4, 9, 2002};

        int days = 0;

        for (int i = rohansBirthDay[0] + 1; i < dates[0]; i++) {
            days += months[i];
        }

        days += dates[1] + (months[rohansBirthDay[0]] - rohansBirthDay[1]);

        float percent = days / (float) 365.0;
        float almostFinalAge = (dates[2] - rohansBirthDay[2]) + percent;
        return String.format("%.2f", almostFinalAge);

    }

    /**
     * Sets Rohans age. Calls the calcAge() method to determine Rohans age
     * based on the current date.
     * @param Todays current date.
     * @throws IllegalArgumentException If the date is not formatted with
     *         characters properly.
     */
    public void setAge(String date) {
        if (!date.contains("/")) {
            throw new IllegalArgumentException("Date not formatted properly.");
        }
        this.age = calcAge(date);
    }

    /**
     * Returns Rohans age.
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets Rohans favorite sport.
     * @throws RohanException If the sport is not football and the sport is not golf.
     */
    public void setSport(String sport) throws RohanException {
        if (!sport.equalsIgnoreCase("football") && !sport.equalsIgnoreCase("golf")) {
            throw new RohanException();
        }
        this.favSport = sport;
    }

    /**
     * Returns Rohans favorite sport
     */
    public String getSport() {
        return favSport;
    }
}
