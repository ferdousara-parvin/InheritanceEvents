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

//    // Copy constructor (which one?)
//    public Festival(String name, double ticketPrice, int numberOfDays, Event other) {
//        super(other);
//        this.name = name;
//        this.ticketPrice = ticketPrice;
//        this.numberOfDays = numberOfDays;
//    }
//
//    public Festival(Festival other) {
//        this.name = other.name;
//        this.ticketPrice = other.ticketPrice;
//        this.numberOfDays = other.numberOfDays;
//    }

}
