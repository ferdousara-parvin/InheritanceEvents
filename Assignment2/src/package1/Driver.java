package package1;

import package2.*;
import package3.SportCompetition;
import package4.Fair;

public class Driver {

    public static void main(String[] args) {
        
        //Message that informs user that this is the first part of the program: testing the creation of different Events
        System.out.println("**************************");
        System.out.println("Events created in list1");
        System.out.println("**************************\n");

        //Creation of 6 different events
        Event[] list1 = {
            new Event(2018, 9, 2),
            new Festival("arts", 20, 30, 2015, 9, 2),
            new CulturalFiesta(3, "film", 20, 10, 2008, 12, 25),
            new MusicFiesta(23, "Justn Bieber", 600, 1, 2018, 2, 28),
            new SportCompetition(23, 2018, 8, 3, SportCompetition.Season.fall),
            new Fair(23, 2019, 6, 2, Fair.TypeOfFair.TRADE)
        };

        //Display each event in list1
        for (Event e : list1) {
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------");
        }
        
     //Message that informs user that this is the second part of the program: testing the copy ctors
        System.out.println("**************************");
        System.out.println("Events created in list2");
        System.out.println("**************************\n");
        

        //Creats events and add them to list2
        Event[] list2 = {
            new Event(list1[0]),
            new Festival((Festival) list1[1]),
            new CulturalFiesta((CulturalFiesta) list1[2]),
            new MusicFiesta((MusicFiesta) list1[3]),
            new SportCompetition((SportCompetition) list1[4]),
            new Fair((Fair) list1[5]),
            new Event(2018, 9, 2),
            new Fair(23, 2019, 6, 2, Fair.TypeOfFair.TRADE),
            new Festival("science", 23, 8, 2019, 1, 2),
            new SportCompetition(2, 2018, 8, 4, SportCompetition.Season.summer)
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
        for(int i = 0; i< list2.length; i++){
        if(list2[i].numberOfCities == list2[leastPopular].numberOfCities) output1 += " #" + i;
        if(list2[i].numberOfCities == list2[mostPopular].numberOfCities) output2 += " #" + i;
        
        }
        
        System.out.println(output1 + "\n" + output2);
        
        //TODO FERDOU: Determine the events that are happening during the same year
        

    }

}
