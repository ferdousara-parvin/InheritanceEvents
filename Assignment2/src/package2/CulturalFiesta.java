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
    
    //Copy constructor
    public CulturalFiesta(CulturalFiesta other){
        super(other.name, other.ticketPrice, other.numberOfDays, other.year, other.month, other.numberOfCities);
        this.numberOfSpokenLanguage = other.numberOfSpokenLanguage;
    }
    
    public boolean equals(CulturalFiesta other){
    if(super.equals(other) && this.numberOfSpokenLanguage == other.numberOfSpokenLanguage) return true;
    else return false;
    }
    
    @Override
    public String toString(){
    return super.toString() + "\nThis cultural fiesta has " + numberOfSpokenLanguage + " of spoken languages.";              
     }




}
