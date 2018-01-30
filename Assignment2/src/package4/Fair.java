package package4;

import package1.Event;

public class Fair extends Event {

    private int numberOfExhibitors;

    private enum typeOfFair {

        CAREER, SCIENCE, TRADE, TRAVEL

    }

    // Constructors
    // Default constructor
    public Fair() {
        super();

    }

    // Parameterized constructor
    public Fair(int numberOfExhibitors, int year, int month, int numberOfCities) {
        super(year, month, numberOfCities);
        this.numberOfExhibitors = numberOfExhibitors;
    }

    // Copy constructor
}
