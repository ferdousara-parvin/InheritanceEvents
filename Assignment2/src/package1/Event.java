package package1;

public class Event {

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

    // Copy ocnstructor
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

    // toString method
    @Override
    public String toString() {
        return "This event will be held in" + month + " " + year + " in " + numberOfCities + " different cities";
    }

}
