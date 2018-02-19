package package2;

public class MusicFiesta extends Festival {

    // Attribute
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
    public MusicFiesta(MusicFiesta other) {
        super(other.name, other.ticketPrice, other.numberOfDays, other.year, other.month, other.numberOfCities);
        this.numberOfBands = other.numberOfBands;
    }

    // Getter and setter
    public int getNumberOfBands() {
        return numberOfBands;
    }

    public void setNumberOfBands(int numberOfBands) {
        this.numberOfBands = numberOfBands;
    }

    // Equals method
    public boolean equals(Object other) {
        // Check if we are comparing two Music Fiestas
        if (other == null) {
            System.out.println("This reference points to no object");
            return false;
        }
        if (!(other.getClass().getSimpleName().equalsIgnoreCase(this.getClass().getSimpleName()))) {
            System.out.println("This is not comparing two MusicFiesta objects");
            return false;
        }

        // Since now, we're sure that Object other is a MusicFiesta object, we can cast it
        MusicFiesta musicFiesta = (MusicFiesta) other;

        if (super.equals(musicFiesta) && this.numberOfBands == musicFiesta.numberOfBands) {
            return true;
        } else {
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + " This music fiesta will host " + numberOfBands + " bands.";
    }

}
