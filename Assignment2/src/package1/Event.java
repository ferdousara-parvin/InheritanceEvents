// Assignment 2
// Question: Part I
// Written by: Viveka Anban (40063308) and Ferdousara Parvin (40062738)


package package1;

//PART 1

/*
public class Event {

    // Attributes
    protected int year;
    protected int month;
    protected int numberOfCities;

    // Constructors
    // Default constructor
    public Event() {

    }

    // Paramaterized constructor
    public Event(int year, int month, int numberOfCities) {
        this.year = year;
        this.month = month;
        this.numberOfCities = numberOfCities;
    }

    // Copy constructor
    public Event(Event other) {
        this.year = other.year;
        this.month = other.month;
        this.numberOfCities = other.numberOfCities;
    }

    // Getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(int numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    // Equals method
    public boolean equals(Object other) {

        // Check if we are comparing two events
         TODO: Where do we need to put the ocmments? --> You  need  to  add  a  comment  indicating  how  effective  these  null verifications inside 
        the method will be in relation to protecting your program from crashing!
        if (other == null) {
            System.out.println("This reference points to no object");
            return false;
        }
        if (!(other.getClass().getSimpleName().equalsIgnoreCase(this.getClass().getSimpleName()))) {
            System.out.println("This is not comparing two Event objects");
            return false;
        }

        // Since now, we're sure that Object other is an Event object, we can cast it
        Event event = (Event) other;

        if (this.month == event.month && this.year == event.year && this.numberOfCities == event.numberOfCities) {
            return true;
        } else {
            return false;
        }

    }

    // toString method
    @Override
    public String toString() {
        return "This event will be held in " + year + ", " + month + " in " + numberOfCities + " different cities.";
    }

}*/


//PART 2

public class Event {

    // Attributes
    //Attributes access rights: Protected to Private
    /* This means, we NEED to create getters and setters to in order to allow access*/
    private int year;
    private int month;
    private int numberOfCities;

    // Constructors
    // Default constructor
    public Event() {

    }

    // Paramaterized constructor
    public Event(int year, int month, int numberOfCities) {
        this.year = year;
        this.month = month;
        this.numberOfCities = numberOfCities;
    }

    // Copy constructor
    public Event(Event other) {
        this.year = other.year;
        this.month = other.month;
        this.numberOfCities = other.numberOfCities;
    }

    // Getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(int numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    // Equals method
    public boolean equals(Object other) {

        // Check if we are comparing two events
        /* TODO: Where do we need to put the ocmments? --> You  need  to  add  a  comment  indicating  how  effective  these  null verifications inside 
        the method will be in relation to protecting your program from crashing!*/
        if (other == null) {
            System.out.println("This reference points to no object");
            return false;
        }
        if (!(other.getClass().getSimpleName().equalsIgnoreCase(this.getClass().getSimpleName()))) {
            System.out.println("This is not comparing two Event objects");
            return false;
        }

        // Since now, we're sure that Object other is an Event object, we can cast it
        Event event = (Event) other;

        if (this.month == event.month && this.year == event.year && this.numberOfCities == event.numberOfCities) {
            return true;
        } else {
            return false;
        }

    }

    // toString method
    @Override
    public String toString() {
        return "This event will be held in " + year + ", " + month + " in " + numberOfCities + " different cities.";
    }

}


