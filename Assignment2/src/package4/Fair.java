package package4;

import package1.Event;

public class Fair extends Event {
    
    public enum TypeOfFair {CAREER, SCIENCE, TRADE, TRAVEL}
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
    
    
    //Equals method
    public boolean equals(Fair other) {
        if (super.equals(other)
                && this.numberOfExhibitors == other.numberOfExhibitors
                && this.type == other.type){
            return true;
        } else {
            return false;
        }
    }

    //toString method
    @Override
    public String toString(){
    return "This  is the " + type + " " + this.getClass().getSimpleName() + ".\n" + super.toString() +
                "\nThere will be " + numberOfExhibitors + " exhibitors.";
    }
    
}
