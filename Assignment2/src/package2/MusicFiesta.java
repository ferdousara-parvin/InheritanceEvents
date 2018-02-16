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
    
    //Copy constructor
    public MusicFiesta(MusicFiesta other) {
        super(other.name,other.ticketPrice, other.numberOfDays, other.year, other.month, other.numberOfCities);
        this.numberOfBands = other.numberOfBands;
    }
    
    //Equals method
    public boolean equals(MusicFiesta other){
    if(super.equals(other) && this.numberOfBands == other.numberOfBands) return true;
    else return false;
    }
    
    //toString method
    @Override 
    public String toString(){
    return super.toString() + " This music fiesta will host " + numberOfBands + " bands.";
    }



}
