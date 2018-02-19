package package2;

public class CulturalFiesta extends Festival {

    // Attribute
    private int numberOfSpokenLanguage;

    // Constructors
    // Default constructor
    public CulturalFiesta() {
        super();
    }

    // Parameterized constructor
    public CulturalFiesta(int numberOfSpokenLanguage, String name, double ticketPrice, int numberOfDays, int year, int month, int numberOfCities) {
        super(name, ticketPrice, numberOfDays, year, month, numberOfCities);
        this.numberOfSpokenLanguage = numberOfSpokenLanguage;
    }

    // Copy constructor
    public CulturalFiesta(CulturalFiesta other) {
        super(other.name, other.ticketPrice, other.numberOfDays, other.year, other.month, other.numberOfCities);
        this.numberOfSpokenLanguage = other.numberOfSpokenLanguage;
    }

    // Getter and setter
    public int getNumberOfSpokenLanguage() {
        return numberOfSpokenLanguage;
    }

    public void setNumberOfSpokenLanguage(int numberOfSpokenLanguage) {
        this.numberOfSpokenLanguage = numberOfSpokenLanguage;
    }

    // Equals method
    public boolean equals(Object other) {
        // Check if we are comparing two Cultural Fiestas
        if (other == null) {
            System.out.println("This reference points to no object");
            return false;
        }
        if (!(other.getClass().getSimpleName().equalsIgnoreCase(this.getClass().getSimpleName()))) {
            System.out.println("This is not comparing two CulturalFiesta objects");
            return false;
        }

        // Since now, we're sure that Object other is a CulturalFiesta object, we can cast it
        CulturalFiesta cuturalFiesta = (CulturalFiesta) other;

        if (super.equals(cuturalFiesta) && this.numberOfSpokenLanguage == cuturalFiesta.numberOfSpokenLanguage) {
            return true;
        } else {
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nThis cultural fiesta has " + numberOfSpokenLanguage + " of spoken languages.";
    }

}
