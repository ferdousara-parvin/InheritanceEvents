package package4;

import package1.Event;

public class Fair extends Event {

    public enum TypeOfFair {
        CAREER, SCIENCE, TRADE, TRAVEL
    }

    // Attributes
    private TypeOfFair type;
    private int numberOfExhibitors;

    // Constructors
    // Default constructor
    public Fair() {
        super();
    }

    // Parameterized constructor
    public Fair(int numberOfExhibitors, int year, int month, int numberOfCities, TypeOfFair type) {
        super(year, month, numberOfCities);
        this.numberOfExhibitors = numberOfExhibitors;
        this.type = type;
    }

    //Copy constructor
    public Fair(Fair other) {
        super(other.year, other.month, other.numberOfCities);
        this.numberOfExhibitors = other.numberOfExhibitors;
        this.type = other.type;
    }

    // Getters and setters
    public TypeOfFair getType() {
        return type;
    }

    public void setType(TypeOfFair type) {
        this.type = type;
    }

    public int getNumberOfExhibitors() {
        return numberOfExhibitors;
    }

    public void setNumberOfExhibitors(int numberOfExhibitors) {
        this.numberOfExhibitors = numberOfExhibitors;
    }

    // Equals method
    public boolean equals(Object other) {
        // Check if we are comparing two Fairs
        if (other == null) {
            System.out.println("This reference points to no object");
            return false;
        }
        if (!(other.getClass().getSimpleName().equalsIgnoreCase(this.getClass().getSimpleName()))) {
            System.out.println("This is not comparing two Fair objects");
            return false;
        }

        // Since now, we're sure that Object other is a SportCompetition object, we can cast it
        Fair fair = (Fair) other;

        if (super.equals(fair) && this.numberOfExhibitors == fair.numberOfExhibitors && this.type == fair.type) {
            return true;
        } else {
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "This is the " + type.toString().toLowerCase() + " " + this.getClass().getSimpleName() + ".\n" + super.toString()
                + "\nThere will be " + numberOfExhibitors + " exhibitors.";
    }

}
