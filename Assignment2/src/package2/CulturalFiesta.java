package package2;

public class CulturalFiesta extends Festival {

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




}
