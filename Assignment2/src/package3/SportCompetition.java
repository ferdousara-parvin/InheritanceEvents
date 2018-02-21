// Assignment 2
// Question: Part I
// Written by: Viveka Anban (40063308) and Ferdousara Parvin (40062738)

package package3;

import package1.Event;

public class SportCompetition extends Event {

    //Create a seasonName type
    public enum Season {
        SUMMER, FALL, WINTER, SPRING;
    }

    // Attributes
    private int numOfActivities;
    private Season season; //Declare an attributes that describes when the sport competition is held

    // Constructors
    // Default constructor
    public SportCompetition() {
        super();

    }

    // Parameterized constructor
    public SportCompetition(int numOfActivities, int year, int month, int numberOfCities, Season season) {
        super(year, month, numberOfCities);
        this.numOfActivities = numOfActivities;
        this.season = season;
    }

    // Copy constructor
    public SportCompetition(SportCompetition other) {
        super(other.year, other.month, other.numberOfCities);
        this.numOfActivities = other.numOfActivities;
        this.season = other.season;
    }

    // Getters and setters
    public int getNumOfActivities() {
        return numOfActivities;
    }

    public void setNumOfActivities(int numOfActivities) {
        this.numOfActivities = numOfActivities;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    // Equals method
    public boolean equals(Object other) {
        // Check if we are comparing two Sport Competitions
        if (other == null) {
            System.out.println("This reference points to no object");
            return false;
        }
        if (!(other.getClass().getSimpleName().equalsIgnoreCase(this.getClass().getSimpleName()))) {
            System.out.println("This is not comparing two SportCompetition objects");
            return false;
        }

        // Since now, we're sure that Object other is a SportCompetition object, we can cast it
        SportCompetition sportCompetition = (SportCompetition) other;

        if (super.equals(sportCompetition) && this.numOfActivities == sportCompetition.numOfActivities && this.season == sportCompetition.season) {
            return true;
        } else {
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "This is the " + season.toString().toLowerCase() + " " + this.getClass().getSimpleName() + ".\n" + super.toString()
                + "\nThere will be " + numOfActivities + " activities during this competition.";
    }

}
