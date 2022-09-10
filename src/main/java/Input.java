import Flight.Flight;
import Flight.Location;
import Flight.Passenger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Input {
    static Scanner in = new Scanner(System.in);

    static Boolean checkLocation(String location){
            if (!Arrays.toString(Location.values()).contains(location)) {
                System.out.print("Please enter the location eg EDI");
                System.out.print(Arrays.toString(Location.values()));
                return false;
            }
            else{
                return true;
            }
        }

        static Location deptLocationInput() {
            System.out.printf("Where do you want to travel from ?  eg EDI%n");
            System.out.printf(Arrays.toString(Location.values()) + "%n");
            String deptLocation = in.next();
            while (!checkLocation(deptLocation)) {
                System.out.printf("Where do you want to travel from ? eg EDI%n");
                System.out.printf(Arrays.toString(Location.values()) + "%n");
                deptLocation = in.next();
            }
            return destFromInput(deptLocation);
        }

        static Location goingLocationInput(){
            System.out.printf("Where do you want to travel ? eg EDI %n");
            System.out.printf(Arrays.toString(Location.values()) + "/%n");
            String location = in.next();

            while (!checkLocation(location)) {
                System.out.printf("Where do you want to travel ? eg EDI %n");
                System.out.printf(Arrays.toString(Location.values()) + "%n");
                location = in.next();
            }

            return destFromInput(location);
        }

        static Date dateInput(){
            System.out.printf("What date do you want to travel ?%nDD-MM-YYYY %n");
            String date = in.next();
            while (!getDateTime.canMakeDate(date)) {
                System.out.printf("Please enter a valid date ?%nDD-MM-YYYY %n");
                date = in.next();
            }

            return getDateTime.makeDate(date);
        }


        static ArrayList<Passenger> makePassengers(int tickets) {
            ArrayList<Passenger> temp = new ArrayList<Passenger>();
            for (int i = 0; i < tickets ; i++) {

                System.out.printf("What is your firstname? %n");
                String fName = in.next();
                System.out.printf("What is your surname? %n");
                String sName = in.next();
                String name = fName + " " + sName;
                System.out.printf("How many bags do you have ? %n");
                int bagCount = in.nextInt();
                Passenger passenger = new Passenger(name, bagCount);
                temp.add(passenger);
            }
            return temp;
        }


    static Location destFromInput(String location){
        return Location.valueOf(location);
    }


    static int noOfTickets(){
        System.out.printf("How many tickets would you like to book ? %n");
        int noOfTickets = in.nextInt();
        return noOfTickets;
    }


    static void bookPassengers(ArrayList<Passenger> inputList, Flight flight){
        for (Passenger pass :inputList) {
            flight.bookPassenger(pass);
            System.out.printf("%s's Ticket: " + pass.getBooking() + "%n", pass.getName());
            System.out.printf("Your Seat Number is %S%n", pass.getSeatNo());
        }
    }


}
