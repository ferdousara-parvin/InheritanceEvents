package package3;

import package1.Event;

public class SportCompetition extends Event {

    private int numberOfActivites;

    private enum seasonName {

        SUMMER, FALL, WINTER, SPRING
    }

    // Constructors
    
    // Default constructor
    public SportCompetition() {
        super();

    }

    // Parameterized constructor
    public SportCompetition(int numberOfActivites, int year, int month, int numberOfCities) {
        super(year, month, numberOfCities);
        this.numberOfActivites = numberOfActivites;
    }
    
    // Copy constructor

}
