package package3;

import package1.Event;
import package2.MusicFiesta;

public class SportCompetition extends Event {

    //Create a seasonName type
    public enum Season {
        summer, fall, winter, spring
    }

    private int numberOfActivites;
    private Season season; //Declare an attributes that describes when the sport competition is held.s

    // Constructors
    // Default constructor
    public SportCompetition() {
        super();

    }

    // Parameterized constructor
    public SportCompetition(int numberOfActivites, int year, int month, int numberOfCities, Season season) {
        super(year, month, numberOfCities);
        this.numberOfActivites = numberOfActivites;
        this.season = season;
    }

    //Copy constructor
    public SportCompetition(SportCompetition other) {
        super(other.year, other.month, other.numberOfCities);
        this.numberOfActivites = other.numberOfActivites;
        this.season = other.season;
    }

    //Equals method
    public boolean equals(SportCompetition other) {
        if (super.equals(other)
                && this.numberOfActivites == other.numberOfActivites
                && this.season == other.season) {
            return true;
        } else {
            return false;
        }
    }

    //toString method
    @Override
    public String toString() {
        return "This  is the " + season + " " + this.getClass().getSimpleName() + ".\n" + super.toString()
                + "\nThere will be " + numberOfActivites + " activities during this competition.";
    }

}
