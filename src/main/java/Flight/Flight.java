package Flight;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Flight {


    private ArrayList<Pilot> pilots;
    private ArrayList<Crew> crew;

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<Crew> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Location getDestination() {
        return destination;
    }

    public Location getDeparture() {
        return departure;
    }

    public String getDepTime() {
        String pattern = "dd-MM-yyyy hh:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(depTime);
        return simpleDateFormat.format(this.depTime);
    }

    public Plane getPlane() {
        return plane;
    }

    public double getWeightCapcity() {
        return weightCapcity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public double getWeightPerPassnger() {
        return weightPerPassnger;
    }

    private ArrayList<Passenger> passengers;
    private String flightNo;
    private Location destination;
    private Location departure;
    private  Date depTime;

    private Plane plane;
    private double weightCapcity;
    private int seatCapacity;
    private double weightPerPassnger;

    public Flight(Plane plane, ArrayList<Pilot> pilots, ArrayList<Crew> crew, ArrayList<Passenger> passengers, String flightNo, Location destination, Location departure, Date depTime) {
        this.plane = plane;
        this.pilots = pilots;
        this.crew = crew;
        this.passengers = passengers;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.depTime = depTime;
        this.weightCapcity = plane.getWeight()/2;
        this.seatCapacity = plane.getCapacity();
        this.weightPerPassnger = weightCapcity/seatCapacity;
    }

    public int getAvaSeats(){
       return seatCapacity;
    }



    public void bookPassenger(Passenger passenger){
        if(getAvaSeats()!=0 && passenger.getTotalWeight() <= weightPerPassnger){
            passengers.add(passenger);
            weightCapcity -= passenger.getTotalWeight();
            passenger.setSeatNo(seatCapacity);
            seatCapacity -= 1;
            Booking pBook = new Booking(flightNo ,departure,destination, depTime );
            passenger.setBooking(pBook.getTicket());
        }
    }


    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public void setCrew(ArrayList<Crew> crew) {
        this.crew = crew;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public double weightTakenByPas(){
        return getPlane().getWeight()/2 - this.weightCapcity;
    }

}
