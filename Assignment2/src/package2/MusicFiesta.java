package package2;

public class MusicFiesta extends Festival {

    private int numberOfBands;

    // Constructors
    
    // Default constructor
    public MusicFiesta() {
        super();

    }

    // Parameterized constructor
    public MusicFiesta(int numberOfBands, String name, double ticketPrice, int numberOfDays, int year, int month, int numberOfCities) {
        super(name, ticketPrice, numberOfDays, year, month, numberOfCities);
        this.numberOfBands = numberOfBands;
    }
    
    // Copy constructor



}
