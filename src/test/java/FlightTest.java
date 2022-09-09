import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;


import static org.junit.Assert.*;

public class FlightTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    Pilot pilot1;
    Pilot pilot2;

    Crew crew1;
    Crew crew2;
    Crew crew3;
    Crew crew4;

    ArrayList<Crew> crew;
    ArrayList<Pilot> pilots;

    Flight flight;
    Bags bag;


    @Before
    public void setUp() {
        passenger1 = new Passenger("bob", new ArrayList<Bags>());
        passenger2 = new Passenger("frank", new ArrayList<Bags>());
        passenger3 = new Passenger("lilly", new ArrayList<Bags>());
        passenger4 = new Passenger("kat", new ArrayList<Bags>());

        passenger1.bags.add(bag);
        passenger2.bags.add(bag);
        passenger3.bags.add(bag);
        passenger4.bags.add(bag);
        passenger4.bags.add(bag);
        passenger4.bags.add(bag);

        pilot1 = new Pilot("teddy", Ranks.CAPTAIN, "000POP" );
        pilot2 = new Pilot("Bobby", Ranks.FIRSTOFFICER, "111POP" );
        pilots = new ArrayList<Pilot>();
        pilots.add(pilot1);
        pilots.add(pilot2);

        crew1= new Crew("Keith", Ranks.FLIGHTATTENDENT);
        crew2= new Crew("Marr", Ranks.FLIGHTATTENDENT);
        crew3= new Crew("Colette", Ranks.FLIGHTATTENDENT);
        crew4= new Crew("James", Ranks.FLIGHTATTENDENT);

        crew = new ArrayList<Crew>();
        crew.add(crew1);
        crew.add(crew2);
        crew.add(crew3);
        crew.add(crew4);

        flight = new Flight(Plane.TESTPLANE,pilots, crew, new ArrayList<Passenger>(),"abc123", Location.DUB, Location.EDI, new Date(2023-1900,01,07, 11,00));

    }

    @Test
    public void getPilots() {
        ArrayList<Pilot> testPilots = flight.getPilots();
        assertEquals("teddy",testPilots.get(0).getName());
    }

    @Test
    public void getCrew() {
        ArrayList<Crew> testCrew = flight.getCrew();
        assertEquals("James", testCrew.get(3).getName());
    }

    @Test
    public void noPassengers() {
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void getFlightNo() {
        assertEquals("abc123", flight.getFlightNo());
    }

    @Test
    public void getDestination() {
        assertEquals(Location.DUB, flight.getDestination());
    }

    @Test
    public void getDeparture() {
        assertEquals(Location.EDI, flight.getDeparture());
    }

    @Test
    public void getDepTime() {
        assertEquals( "07-02-2023 11:00", flight.getDepTime());
    }

    @Test
    public void getPlane() {
        assertEquals( Plane.TESTPLANE,flight.getPlane());
    }

    @Test
    public void getWeightCapcity() {
        assertEquals(200.0, flight.getWeightCapcity(), 0.0);
    }

    @Test
    public void getSeatCapacity() {
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getSeatCapacity());
    }

    @Test
    public void getWeightPerPassnger() {
        assertEquals(100, flight.getWeightPerPassnger(),0.1);
    }

    @Test
    public void getAvaSeats() {
        assertEquals(2, flight.getAvaSeats());
    }

    @Test
    public void bookPassenger() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, flight.getPassengers().size());
    }

    @Test
    public void cannotOverBook(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(2, flight.getPassengers().size());

    }  @Test
    public void noTicketDup(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(1, flight.getPassengers().get(1).getSeatNo());
        assertEquals(2, flight.getPassengers().get(0).getSeatNo());

    }

}