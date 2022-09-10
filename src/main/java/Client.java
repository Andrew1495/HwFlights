import Flight.*;
import java.util.ArrayList;
import java.util.Date;




public class Client {

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
        ArrayList<Passenger> bookedPassengers = new ArrayList<Passenger>();
        ArrayList<Passenger> pasToBook;

        Flight flight;




        Location deptLocation = Input.deptLocationInput();
        Location destLocation = Input.goingLocationInput();
        Date date = Input.dateInput();
        int noOfTickets = Input.noOfTickets();
        pasToBook = Input.makePassengers(noOfTickets);

        flight = new Flight(Plane.BOEING303, pilots, crew,bookedPassengers, "123"+destLocation, destLocation, deptLocation,date);

        Input.bookPassengers(pasToBook, flight);

        }

}

