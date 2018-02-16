package package2;

import package1.Event;

public class Festival extends Event {

    protected String name;
    protected double ticketPrice;
    protected int numberOfDays;

    // Constructor
    // Default constructor
    public Festival() {
        super();

    }

    // Parameterized constructor
    public Festival(String name, double ticketPrice, int numberOfDays, int year, int month, int numberOfCities) {
        super(year, month, numberOfCities);
        this.name = name;
        this.ticketPrice = ticketPrice;
        this.numberOfDays = numberOfDays;
    }

    //Copy constructor
    public Festival(Festival other) {
        super(other.year, other.month, other.numberOfCities);
        this.name = other.name;
        this.ticketPrice = other.ticketPrice;
        this.numberOfDays = other.numberOfDays;
    }

    // equals method
    public boolean equals(Festival other) {
        if (super.equals(other) 
                && this.name == other.name
                && this.ticketPrice == other.ticketPrice
                && this.numberOfDays == other.numberOfDays) return true;
        else return false;     
    }

    @Override
    public String toString() {
        return "This  is the " + name.toLowerCase() + " " + this.getClass().getSimpleName() + ".\n" + super.toString()
                + "\nThe ticket will cost " + ticketPrice + ".\nThis festival will last " + numberOfDays + " days.";
    }

}
