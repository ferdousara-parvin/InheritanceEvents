// Assignment 2
// Question: Part I and II 
// Written by: Viveka Anban (40063308) and Ferdousara Parvin (40062738)
/* Purpose: The purpose of this program is to put into practice some concepts learnt in class such as the concept of inheritance, packages, constructors, 
access rights, method overriding, etc. For this assignment, we had to develop a program that would help manage the numerous events that are being held or have been held. */

 /*
PART 2:
In Part 1, most of the attributes in parent classes are protected as all the classes in this program (except for the Driver class) are subclasses of Event.
Therefore, there was no security risks by opening the access rights and, thus, allowing classes from different packages access to Event attributes as all classes are derived from Event class.

However, as there were room for tighter restriction, in Part 2, we changed most of the access rights of all classes to private.
This meant that whenever we called those attributes by name (super ctor, copy ctor), we had to change the code and use accessors instead.
 */
package package1;

import package2.*;
import package3.SportCompetition;
import package4.Fair;

public class Driver {

    static MusicFiesta mf1; // Created to test equality of two objects

    //TODO: Put constants
    static final int ZERO = 0;
    static final int ONE = 1;
    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;
    static final int SIX = 6;
    static final int EIGHT = 8;
    static final int NINE = 9;
    static final int TEN = 10;
    static final int TWELVE = 12;

    static final int TWENTY = 20;
    static final int TWENTY_THREE = 23;
    static final int TWENTY_FIVE = 23;
    static final int THIRTY = 30;
    static final int SIX_HUNDRED = 30;

    static final int TWO_THOUSAND_AND_FIFTEEN = 2015;
    static final int TWO_THOUSAND_AND_EIGHTEEN = 2018;
    static final int TWO_THOUSAND_AND_NINETEEN = 2019;

    //Method that is supposed to return an array with copies of the events in the original array
    public static Event[] copyFestival(Event[] eventArray) {
        Event[] copy = new Event[eventArray.length];
        for (int i = ZERO; i < copy.length; i++) {
            copy[i] = new Event(eventArray[i]);
        }
        return copy;
    }

    public static void main(String[] args) {

        // Print a welcome message
        System.out.println("--------------------------------------\n"
                + " Welcome to Viveka and Ferdousara's program\n"
                + "--------------------------------------------");

        System.out.println("\n--------------------------------PART I-------------------------------");

        // ****Part 1.1
        // Testing toString method
        System.out.println();
        System.out.println("**************************");
        System.out.println("Testing toString method");
        System.out.println("**************************\n");

        //Creation of 6 different events
        Event[] list1 = {
            new Event(TWO_THOUSAND_AND_EIGHTEEN, NINE, TWO),
            new Festival("arts", TWENTY, THIRTY, TWO_THOUSAND_AND_FIFTEEN, NINE, TWO),
            new CulturalFiesta(THREE, "film", TWENTY, TEN, 2008, TWELVE, TWENTY_FIVE),
            new MusicFiesta(TWENTY_THREE, "Justn Bieber", SIX_HUNDRED, ONE, TWO_THOUSAND_AND_EIGHTEEN, TWO, 28),
            new SportCompetition(TWENTY_THREE, TWO_THOUSAND_AND_EIGHTEEN, EIGHT, THREE, SportCompetition.Season.FALL),
            new Fair(TWENTY_THREE, TWO_THOUSAND_AND_NINETEEN, SIX, TWO, Fair.TypeOfFair.TRADE)
        };

        // Print each event in list1
        for (int i = ZERO; i < list1.length; i++) {
            System.out.println("#" + i + ". " + list1[i]);
            System.out.println("----------------------------------------------------------------------");
        }

        // Testing equality
        System.out.println("\n**************************");
        System.out.println("Testing equals method");
        System.out.println("**************************\n");

        Festival fe1 = new Festival("arts", TWENTY, THIRTY, TWO_THOUSAND_AND_FIFTEEN, NINE, TWO);
        Fair fa1 = new Fair(TWENTY_THREE, TWO_THOUSAND_AND_NINETEEN, SIX, TWO, Fair.TypeOfFair.TRADE);
        Fair fa2 = new Fair(TWENTY_THREE, TWO_THOUSAND_AND_NINETEEN, SIX, TWO, Fair.TypeOfFair.SCIENCE);

        //Display the compared events
        System.out.println("A. " + fe1);
        System.out.println("\nB. " + fa1);
        System.out.println("\nC. " + fa2);
        System.out.println("\nD. " + mf1);

        System.out.println("\nAre #0 and A equal? ");
        System.out.print(list1[ZERO].equals(fe1)); // Two different type of objects
        System.out.println("\n----------------------------------------------------------------------");

        System.out.println("Are #3 and D equal? ");
        System.out.print(list1[THREE].equals(mf1));// One object is null
        System.out.println("\n----------------------------------------------------------------------");

        System.out.println("Are #5 and B equal? " + list1[FIVE].equals(fa1)); // Equal objects
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Are #5 and C equal? " + list1[FIVE].equals(fa2)); // Not equal objects
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Are #1 and #3 equal? ");
        System.out.print(list1[ONE].equals((Festival) list1[THREE])); // Two different type of objects even when casted
        System.out.println("\n----------------------------------------------------------------------");

        System.out.println();

        // Part 1.2
        // Creats events and add them to list2
        Event[] list2 = {
            new Event(list1[ZERO]),
            new Festival(fe1), // Use of copy cstor
            new CulturalFiesta((CulturalFiesta) list1[TWO]),
            new MusicFiesta((MusicFiesta) list1[THREE]),
            new SportCompetition((SportCompetition) list1[FOUR]),
            new Fair(fa1), // Use of copy cstor
            new Event(TWO_THOUSAND_AND_EIGHTEEN, NINE, TWO),
            new Fair(TWENTY_THREE, TWO_THOUSAND_AND_NINETEEN, SIX, TWO, Fair.TypeOfFair.TRADE),
            new Festival("science", TWENTY_THREE, EIGHT, TWO_THOUSAND_AND_NINETEEN, ONE, TWO),
            new SportCompetition(TWO, TWO_THOUSAND_AND_EIGHTEEN, EIGHT, FOUR, SportCompetition.Season.SUMMER)
        };

        System.out.println("//Array of 10 Event objects//");

        // Display events in list2 and seperate them with a divider (Purpose of this for loop: for clarity only)
        for (int i = ZERO; i < list2.length; i++) {
            System.out.println("#" + i + ". " + list2[i]);
            System.out.println("----------------------------------------------------------------------");
        }

        //-------------Most/least amount of cities-------------------//
        System.out.println("\n*************************************************");
        System.out.println("Finding events with least/most amount of cities");
        System.out.println("*************************************************\n");

        // Determine the most "popular" event
        int leastPopular = ZERO;
        int mostPopular = ZERO;

        //PART 1
        /*
        for (int i = ZERO; i < list2.length; i++) {
            for (int k = ONE; k < list2.length; k++) {
                if (list2[i].numberOfCities == list2[leastPopular].numberOfCities || list2[i].numberOfCities == list2[mostPopular].numberOfCities) {
                    break;
                } else if (list2[i].numberOfCities < list2[k].numberOfCities && list2[i].numberOfCities < list2[leastPopular].numberOfCities) {
                    leastPopular = i;
                } else if (list2[i].numberOfCities > list2[k].numberOfCities && list2[i].numberOfCities > list2[mostPopular].numberOfCities) {
                    mostPopular = i;
                }
            }
        }
         */
        //PART 2
        //Accessors and mutators needed for subclasses to access parent classes as all attributes are restricted
        for (int i = ZERO; i < list2.length; i++) {
            for (int k = ONE; k < list2.length; k++) {
                if (list2[i].getNumberOfCities() == list2[leastPopular].getNumberOfCities() || list2[i].getNumberOfCities() == list2[mostPopular].getNumberOfCities()) {
                    break;
                } else if (list2[i].getNumberOfCities() < list2[k].getNumberOfCities() && list2[i].getNumberOfCities() < list2[leastPopular].getNumberOfCities()) {
                    leastPopular = i;
                } else if (list2[i].getNumberOfCities() > list2[k].getNumberOfCities() && list2[i].getNumberOfCities() > list2[mostPopular].getNumberOfCities()) {
                    mostPopular = i;
                }
            }
        }

        String output1 = "The event(s) that will include the LEAST amount of cities: ";
        String listOfLeastPopular;
        String output2 = "The event(s) that will include the MOST amount of cities: ";
        String listOfMostPopular;

        //Iterate through the list and display all the events that are the least and most popular
        //PART1
        /*
        for (int i = ZERO; i < list2.length; i++) {
            if (list2[i].numberOfCities == list2[leastPopular].numberOfCities) {
                output1 += " #" + i;
            }
            if (list2[i].numberOfCities == list2[mostPopular].numberOfCities) {
                output2 += " #" + i;
            }

        }
         */
        //PART 2
        for (int i = ZERO; i < list2.length; i++) {
            if (list2[i].getNumberOfCities() == list2[leastPopular].getNumberOfCities()) {
                output1 += " \n#" + i + ". " + list2[i] + "\n---------------------------";
            }
            if (list2[i].getNumberOfCities() == list2[mostPopular].getNumberOfCities()) {
                output2 += " \n#" + i + ". " + list2[i] + "\n---------------------------";
            }

        }

        System.out.println(output1 + "\n\n" + output2);

        //---------------Events held the same year ---------------------------//
        System.out.println("\n*************************************************");
        System.out.println("Finding events held the same year");
        System.out.println("*************************************************\n");

        /*
        Sort the list2 according to the year : 
        Compare each element to every element following it. If an event with a more recent year is found, swap places with the original event.
         */
        //Create an array with the year attribute of every Event in list2
        int[] sortedYears = new int[list2.length];

        for (int i = ZERO; i < list2.length; i++) {
            sortedYears[i] = list2[i].getYear();
        }

        for (int i = ZERO; i < sortedYears.length - ONE; i++) {

            // Find the minimum element in unsorted array
            int indexOfSmallestYear = i;
            for (int j = i + ONE; j < sortedYears.length; j++) // always compare the elements with the following elements (never itself)
            {
                if (sortedYears[j] < sortedYears[indexOfSmallestYear]) {
                    indexOfSmallestYear = j;
                }
            }

            // Swap the more recent year with the initial year
            int temp = sortedYears[indexOfSmallestYear];
            sortedYears[indexOfSmallestYear] = sortedYears[i];
            sortedYears[i] = temp;
        }

        System.out.println("The following events will happen during the same year: ");

    
       
        for (int i = ZERO; i < sortedYears.length - 1; i++) {

            if (i == 0 || sortedYears[i] > sortedYears[i - 1]) { // Whenever "a new year" begins, print the year in addition to the Event info
                System.out.println("\n" + sortedYears[i] + ": ");
                for (int k = ZERO; k < list2.length; k++) {
                    if (list2[k].getYear() == sortedYears[i]) {
                        System.out.println("\n#" + k + ". " + list2[k]);
                    }
                }
            } 
            else {
                for (int k = ZERO; k < list2.length; k++) {
                    if (list2[i].getYear() == sortedYears[i]) {
                        System.out.println("\n#" + k + ". " + list2[k]);
                    }
                }
            }

        }

        System.out.println("\n--------------------------------PART II-------------------------------");

        System.out.println("\n**************************");
        System.out.println("Testing copyfestival");
        System.out.println("**************************\n");

        System.out.println("//Array of 12 Event objects//");

        Event[] list3 = {
            new Event(list1[ZERO]),
            new Festival(fe1), // Use of copy cstor
            new CulturalFiesta((CulturalFiesta) list1[TWO]),
            new MusicFiesta((MusicFiesta) list1[THREE]),
            new SportCompetition((SportCompetition) list1[FOUR]),
            new Fair(fa1), // Use of copy cstor
            new Event(TWO_THOUSAND_AND_EIGHTEEN, NINE, TWO),
            new Festival("science", TWENTY_THREE, EIGHT, TWO_THOUSAND_AND_NINETEEN, ONE, TWO),
            new CulturalFiesta(FOUR, "salsa", TWENTY, TEN, 2014, TWELVE, TWENTY_FIVE),
            new MusicFiesta(TWENTY_THREE, "Coachella", SIX_HUNDRED, ONE, 2004, TWO, ONE),
            new SportCompetition(TWO, TWO_THOUSAND_AND_EIGHTEEN, EIGHT, FOUR, SportCompetition.Season.SUMMER),
            new Fair(TWENTY_THREE, TWO_THOUSAND_AND_NINETEEN, SIX, TWO, Fair.TypeOfFair.TRADE)
        };

        // Print original array
        System.out.println("ORIGINAL ARRAY");
        for (int i = ZERO; i < list3.length; i++) {
            System.out.println("#" + i + ". " + list3[i]);
            System.out.println("----------------------------------------------------------------------");
        }

        // Create a copy of list3
        Event[] copiedList3 = copyFestival(list3);

        // Print copied array
        System.out.println("\nCOPY ARRAY");
        for (int i = ZERO; i < copiedList3.length; i++) {
            System.out.println("#" + i + ". " + copiedList3[i]);
            System.out.println("----------------------------------------------------------------------");
        }

        /*
        As we can see, this output clearly shows that each one of these events is created as an Event. 
        By using the Event copy constructor, we create another Event. When using the Event copy ctor, there will be no 
        polymorphism. Without polymorphism, the compiler will assume that we are indeed only creating copies of 
        Event classes and will misbehave because we would like copies of the derived classes too. We could try 
        fixing this problem by trying to find out each element's class and then create and instance of that class 
        to store in the returned array. However, we would still not be using polymorphism then and such solution 
        would only work on a small sample (ex. Hard coding is impossible when you have 100 different derived classes).
        
         */
        // Print closing message
        System.out.println(
                "\n--------------------------------------------\n"
                + " Thank you for using our program. Goodbye!\n"
                + "--------------------------------------------\n");
    }

}
