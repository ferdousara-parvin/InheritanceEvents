package package1;

import package2.*;
import package3.SportCompetition;
import package4.Fair;

public class Driver {

    static MusicFiesta mf1; // Created to test equality of two objects

    public static void main(String[] args) {

        //An Event List created to test the toString and equals method
        System.out.println("**************************");
        System.out.println("Events created in list1");
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

        //Display each event in list1
        for (Event e : list1) {
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------");
        }

        // Testing equality
        Festival fe1 = new Festival("arts", 20, 30, 2015, 9, 2);
        Fair fa1 = new Fair(23, 2019, 6, 2, Fair.TypeOfFair.TRADE);
        Fair fa2 = new Fair(23, 2019, 6, 2, Fair.TypeOfFair.SCIENCE); 

        System.out.println("Are these equal? " + list1[0].equals(fe1)); // Two different type of objects
        System.out.println("Are these equal? " + list1[3].equals(mf1)); // One object is null
        System.out.println("Are these equal? " + list1[5].equals(fa1)); // Equal objects
        System.out.println("Are these equal? " + list1[5].equals(fa2)); // Not equal objects
        System.out.println("Are these equal? " + list1[1].equals((Festival) list1[3])); // Two different type of objects even when casted

        //Event List with 10 Event objects
        System.out.println("**************************");
        System.out.println("Events created in list2");
        System.out.println("**************************\n");

        //Creats events and add them to list2
        Event[] list2 = {
            new Event(list1[0]),
            new Festival(fe1), // Use of copy cstor
            new CulturalFiesta((CulturalFiesta) list1[2]),
            new MusicFiesta((MusicFiesta) list1[3]),
            new SportCompetition((SportCompetition) list1[4]),
            new Fair(fa1), // Use of copy constructor
            new Event(2018, 9, 2),
            new Fair(23, 2019, 6, 2, Fair.TypeOfFair.TRADE),
            new Festival("science", 23, 8, 2019, 1, 2),
            new SportCompetition(2, 2018, 8, 4, SportCompetition.Season.SUMMER)
        };

        //Display events in list2 and seperate them with a divider (for clarity)
        for (int i = 0; i < list2.length; i++) {
            System.out.println("#" + i + ". " + list2[i]);
            System.out.println("----------------------------------------------------------------------");
        }

        //Determine the most "popular" event
        int leastPopular = 0;
        int mostPopular = 0;

        for (int i = 0; i < list2.length; i++) {
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

        String output1 = "The event that will include the least amount of cities: ";
        String output2 = "The event that will include the most amount of cities: ";

        //Iterate through the list and display all the events that are the least and most popular
        for (int i = 0; i < list2.length; i++) {
            if (list2[i].numberOfCities == list2[leastPopular].numberOfCities) {
                output1 += " #" + i;
            }
            if (list2[i].numberOfCities == list2[mostPopular].numberOfCities) {
                output2 += " #" + i;
            }

        }

        System.out.println(output1 + "\n" + output2);

        //TODO FERDOU: Determine the events that are happening during the same year
    }

}
