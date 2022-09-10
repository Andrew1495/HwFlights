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


        Flight flight;

        System.out.print("Enter yes to start and quit or q to exit");
        Scanner in = new Scanner(System.in);
        while(!in.next().equals("quit") || !in.next().equals("q")) {
            System.out.printf("What is your name? %n ");
            String name = in.nextLine();
            System.out.printf(" How many bags do you have ? %n");
            int bagCount = in.nextInt();
            System.out.printf("Where do you want to travel ? eg EDI %n");
            System.out.printf(Arrays.toString(Location.values()) + "/%n");
            String location = in.next();

            while (!Client.checkLocation(location)) {
                System.out.printf("Where do you want to travel ? eg EDI %n");
                System.out.printf(Arrays.toString(Location.values()) + "%n");
                location = in.next();
            }
            Location destination = destFromInput(location);
            passenger = new Passenger(name, bagCount);
            flight = new Flight(Plane.BOEING101, pilots, crew, new ArrayList<Passenger>(), "123" + location, destination, Location.EDI, getDateTime.makeDate());
            flight.bookPassenger(passenger);
            System.out.printf("Ticket: " + passenger.getBooking() + "%n");
            System.out.printf("Your Seat Number is %S", passenger.getSeatNo());
        }
    }
}
