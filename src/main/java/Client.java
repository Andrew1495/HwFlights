import Flight.*;
import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



public class Client {


    Scanner in = new Scanner(System.in);
    static Boolean checkLocation(String location) {
        if (!Arrays.toString(Location.values()).contains(location)) {
            System.out.print("Please enter the location eg EDI");
            System.out.print(Arrays.toString(Location.values()));
            return false;
        }
        else{
            return true;
        }
    }

    static Location destFromInput(String location){
        return Location.valueOf(location);
    }



    public static void main(String[] args) {


        Passenger passenger;

        Pilot pilot1 = new Pilot("teddy", Ranks.CAPTAIN, "000POP");
        Pilot pilot2 = new Pilot("Bobby", Ranks.FIRSTOFFICER, "111POP");

        Crew crew1 = new Crew("Keith", Ranks.FLIGHTATTENDENT);
        Crew crew2 = new Crew("Marr", Ranks.FLIGHTATTENDENT);
        Crew crew3 = new Crew("Colette", Ranks.FLIGHTATTENDENT);
        Crew crew4 = new Crew("James", Ranks.FLIGHTATTENDENT);
        ArrayList<Crew> crew = new ArrayList<Crew>();
        crew.add(crew1);
        crew.add(crew2);
        crew.add(crew3);
        crew.add(crew4);

        ArrayList<Pilot> pilots = new ArrayList<Pilot>();
        pilots.add(pilot1);
        pilots.add(pilot2);

        ArrayList<Passenger> pasToBook =  pasToBook = new ArrayList<Passenger>();

        Flight flight;
        int noOfTickets;



        Scanner in = new Scanner(System.in);

        System.out.printf("Where do you want to travel from ?  eg EDI%n");
        System.out.printf(Arrays.toString(Location.values()) + "%n");
        String deptLocation = in.next();
        while (!Client.checkLocation(deptLocation)) {
            System.out.printf("Where do you want to travel from ? eg EDI%n");
            System.out.printf(Arrays.toString(Location.values()) + "%n");
            deptLocation = in.next();
        }
        System.out.printf("Where do you want to travel ? eg EDI %n");
        System.out.printf(Arrays.toString(Location.values()) + "/%n");
        String location = in.next();

        while (!Client.checkLocation(location)) {
            System.out.printf("Where do you want to travel ? eg EDI %n");
            System.out.printf(Arrays.toString(Location.values()) + "%n");
            location = in.next();
        }


        System.out.printf("What date do you want to travel ?%n DD-MM-YYYY %n");
        String date = in.next();
        while (!getDateTime.canMakeDate(date)) {
            System.out.printf("Please enter a valid date ?%n DD-MM-YYYY %n");
           date = in.next();
        }
        Date setDate = getDateTime.makeDate(date);
        Location destination = destFromInput(location);
        Location depart = destFromInput(deptLocation);

        flight = new Flight(Plane.BOEING303, pilots, crew, new ArrayList<Passenger>(), "123" + location, destination, depart, setDate);


        System.out.printf("How many tickets would you like to book ? %n");
            noOfTickets = in.nextInt();
        for (int i = 0; i < noOfTickets ; i++) {
            System.out.printf("What is your firstname? %n");
            String fName = in.next();
            System.out.printf("What is your surname? %n");
            String sName = in.next();
            String name = fName + " " + sName;
            System.out.printf("How many bags do you have ? %n");
            int bagCount = in.nextInt();
            passenger = new Passenger(name, bagCount);

            pasToBook.add(passenger);
            }


        for (Passenger pass :pasToBook) {
            flight.bookPassenger(pass);
            System.out.printf("%s's Ticket: " + pass.getBooking() + "%n", pass.getName());
            System.out.printf("Your Seat Number is %S%n", pass.getSeatNo());
        }

        }

}

