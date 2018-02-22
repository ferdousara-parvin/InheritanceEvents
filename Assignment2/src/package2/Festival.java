// Assignment 2
// Question: Part I
// Written by: Viveka Anban (40063308) and Ferdousara Parvin (40062738)

package package2;

import package1.Event;

/*
public class Festival extends Event {

    // Attributes
    protected String name;
    protected double ticketPrice;
    protected int numberOfDays;

    // Constructors
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

    // Copy constructor
    public Festival(Festival other) {
        super(other.year, other.month, other.numberOfCities);
        this.name = other.name;
        this.ticketPrice = other.ticketPrice;
        this.numberOfDays = other.numberOfDays;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    // Equals method
    public boolean equals(Object other) {
        // Check if we are comparing two Festival
        if (other == null) {
            System.out.println("This reference points to no object");
            return false;
        }
        if (!(other.getClass().getSimpleName().equalsIgnoreCase(this.getClass().getSimpleName()))) {
            System.out.println("This is not comparing two Festival objects");
            return false;
        }

        // Since now, we're sure that Object other is a Festival object, we can cast it
        Festival festival = (Festival) other;

        if (super.equals(festival) && this.name == festival.name && this.ticketPrice == festival.ticketPrice && this.numberOfDays == festival.numberOfDays) {
            return true;
        } else {
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "This is the " + name.toLowerCase() + " " + this.getClass().getSimpleName() + ".\n" + super.toString()
                + "\nThe ticket will cost " + ticketPrice + ".\nThis festival will last " + numberOfDays + " days.";
    }

}
*/


public class Festival extends Event {

    // Attributes
    /*As attributes become more restricted, accessors and mutators are needed to allow access to these atrributes in other classes.*/
    private String name;
    private double ticketPrice;
    private int numberOfDays;

    // Constructors
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

    // Copy constructor
    public Festival(Festival other) {
        super(other.getYear(), other.getMonth(), other.getNumberOfCities());
        this.name = other.name;
        this.ticketPrice = other.ticketPrice;
        this.numberOfDays = other.numberOfDays;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    // Equals method
    public boolean equals(Object other) {
        // Check if we are comparing two Festival
        if (other == null) {
            System.out.println("This reference points to no object");
            return false;
        }
        if (!(other.getClass().getSimpleName().equalsIgnoreCase(this.getClass().getSimpleName()))) {
            System.out.println("This is not comparing two Festival objects");
            return false;
        }

        // Since now, we're sure that Object other is a Festival object, we can cast it
        Festival festival = (Festival) other;

        if (super.equals(festival) && this.name == festival.name && this.ticketPrice == festival.ticketPrice && this.numberOfDays == festival.numberOfDays) {
            return true;
        } else {
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "This is the " + name.toLowerCase() + " " + this.getClass().getSimpleName() + ".\n" + super.toString()
                + "\nThe ticket will cost " + ticketPrice + ".\nThis festival will last " + numberOfDays + " days.";
    }

}


