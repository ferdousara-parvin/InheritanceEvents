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
    static final int TWO_THOUSAND_AND_EIGHT = 2018;
    static final int TWO_THOUSAND_AND_NINE = 2019;

    //Method that returns an array with copies of the events in the original array
    public static Event[] copyFestival(Event[] eventArray) {
        Event[] copy = new Event[eventArray.length];

        for (int i = ZERO; i < copy.length; i++) {

            String className = eventArray[i].getClass().getSimpleName().toLowerCase();
            
            //Cast each element in the array to the corresponding derived class of Event
            switch (className) {
                case "event":
                    copy[i] = new Event(eventArray[i]);
                    break;
                case "festival":
                    copy[i] = new Festival((Festival) eventArray[i]);
                    break;
                case "culturalfiesta":
                    copy[i] = new CulturalFiesta((CulturalFiesta) eventArray[i]);
                    break;
                case "musicfiesta":
                    copy[i] = new MusicFiesta((MusicFiesta) eventArray[i]);
                    break;
                case "sportcompetition":
                    copy[i] = new SportCompetition((SportCompetition) eventArray[i]);
                    break;
                case "fair":
                    copy[i] = new Fair((Fair) eventArray[i]);
                    break;
            }
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
            new Event(2018, 9, 2),
            new Festival("arts", 20, 30, 2015, 9, 2),
            new CulturalFiesta(3, "film", 20, 10, 2008, 12, 25),
            new MusicFiesta(23, "Justn Bieber", 600, 1, 2018, 2, 28),
            new SportCompetition(23, 2018, 8, 3, SportCompetition.Season.FALL),
            new Fair(23, 2019, 6, 2, Fair.TypeOfFair.TRADE)
        };

        // Print each event in list1
        for (int i = 0; i < list1.length; i++) {
            System.out.println("#" + i + ". " + list1[i]);
            System.out.println("----------------------------------------------------------------------");
        }

        // Testing equality
        System.out.println("\n**************************");
        System.out.println("Testing equals method");
        System.out.println("**************************\n");

        Festival fe1 = new Festival("arts", 20, 30, 2015, 9, 2);
        Fair fa1 = new Fair(23, 2019, 6, 2, Fair.TypeOfFair.TRADE);
        Fair fa2 = new Fair(23, 2019, 6, 2, Fair.TypeOfFair.SCIENCE);

        //Display the compared events
        System.out.println("A. " + fe1);
        System.out.println("\nB. " + fa1);
        System.out.println("\nC. " + fa2);
        System.out.println("\nD. " + mf1);

        System.out.println("\nAre #0 and A equal? ");
        System.out.print(list1[0].equals(fe1)); // Two different type of objects
        System.out.println("\n----------------------------------------------------------------------");

        System.out.println("Are #3 and D equal? ");
        System.out.print(list1[3].equals(mf1));// One object is null
        System.out.println("\n----------------------------------------------------------------------");

        System.out.println("Are #5 and B equal? " + list1[5].equals(fa1)); // Equal objects
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Are #5 and C equal? " + list1[5].equals(fa2)); // Not equal objects
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Are #1 and #3 equal? ");
        System.out.print(list1[1].equals((Festival) list1[3])); // Two different type of objects even when casted
        System.out.println("\n----------------------------------------------------------------------");

        System.out.println();

        // Part 1.2
        // Creats events and add them to list2
        Event[] list2 = {
            new Event(list1[0]),
            new Festival(fe1), // Use of copy cstor
            new CulturalFiesta((CulturalFiesta) list1[2]),
            new MusicFiesta((MusicFiesta) list1[3]),
            new SportCompetition((SportCompetition) list1[4]),
            new Fair(fa1), // Use of copy cstor
            new Event(2018, 9, 2),
            new Fair(23, 2019, 6, 2, Fair.TypeOfFair.TRADE),
            new Festival("science", 23, 8, 2019, 1, 2),
            new SportCompetition(2, 2018, 8, 4, SportCompetition.Season.SUMMER)
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
            for (int k = 1; k < list2.length; k++) {
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
            for (int k = 1; k < list2.length; k++) {
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

        int[] yearWithMultipleEventsAndAlreadyPrinted = {ZERO, ZERO, ZERO, ZERO}; // Since in list2, there are four different possibility of years (2008, 2015, 2018, and 2019)
        int index = ZERO;

        // Loop through list2
        for (int i = ZERO; i < list2.length; i++) {

            String output = "The following events will be held in the same year: #" + i;
            int numberOfMatch = ZERO; // initialize to 0 everytime we loop in the main for loop

            // Compare every event's year to every other event's year except its own
            for (int j = ZERO; j < list2.length; j++) {
                if (list2[i].getYear() == list2[j].getYear() && i != j) { // i != j is written so that we do not ocmpare an event to itself
                    output += " #" + j; // Add the event's index in the list2 array to the string output
                    numberOfMatch++; // to keep track of how many matches we have for the same year
                }
            }

            // Events occuring in the same year are printed if there is at least one match (two events in the same year) and if that year has not been printed yet
            if (numberOfMatch > ZERO) { // Two events or more have the same year

                boolean isAMatch = false; // initialize isAMath to false before going through the if statement

                for (int k = ZERO; k < yearWithMultipleEventsAndAlreadyPrinted.length; k++) {
                    if (list2[i].getYear() == yearWithMultipleEventsAndAlreadyPrinted[k]) { // that year has already been printed
                        isAMatch = true;
                    }
                }

                if (!isAMatch) { // Will only go through this if statement if the specific year has not been printed yet
                    System.out.println(output + " which is in " + list2[i].getYear()); // Print output
                    yearWithMultipleEventsAndAlreadyPrinted[index] = list2[i].getYear(); // Add the year to the array yearWithMultipleEventsAndAlreadyPrinted to remember that we already printed all the events happening that year
                    index++; // to add the next year to the next index of array yearWithMultipleEventsAndAlreadyPrinted
                }

            }
        }

        System.out.println("\n--------------------------------PART II-------------------------------");

        System.out.println("\n**************************");
        System.out.println("Testing copyfestival");
        System.out.println("**************************\n");

        System.out.println("//Array of 12 Event objects//");

        Event[] list3 = {
            new Event(list1[0]),
            new Festival(fe1), // Use of copy cstor
            new CulturalFiesta((CulturalFiesta) list1[2]),
            new MusicFiesta((MusicFiesta) list1[3]),
            new SportCompetition((SportCompetition) list1[4]),
            new Fair(fa1), // Use of copy cstor
            new Event(2018, 9, 2),
            new Festival("science", 23, 8, 2019, 1, 2),
            new CulturalFiesta(4, "salsa", 20, 10, 2014, 12, 25),
            new MusicFiesta(23, "Coachella", 600, 1, 2004, 2, 1),
            new SportCompetition(2, 2018, 8, 4, SportCompetition.Season.SUMMER),
            new Fair(23, 2019, 6, 2, Fair.TypeOfFair.TRADE)
        };

        // Print original array
        System.out.println("ORIGINAL ARRAY");
        for (int i = 0; i < list3.length; i++) {
            System.out.println("#" + i + ". " + list3[i]);
            System.out.println("----------------------------------------------------------------------");
        }

        // Create a copy of list3
        Event[] copiedList3 = copyFestival(list3);

        // Print copied array
        System.out.println("\nCOPY ARRAY");
        for (int i = 0; i < copiedList3.length; i++) {
            System.out.println("#" + i + ". " + copiedList3[i]);
            System.out.println("----------------------------------------------------------------------");
        }

        /* As we can see in the output, copiedList3 (coppied array with 12 Event object) is an exact copy of list3 9original array 
         with 12 Event objects) because by using copy constructors, we were able to create a clone of every single Event object from the original array */
        // Print closing message
        System.out.println(
                "\n--------------------------------------------\n"
                + " Thank you for using our program. Goodbye!\n"
                + "--------------------------------------------\n");
    }

}
