import java.util.ArrayList;
import java.util.HashMap;

public class Passenger {
    private String name;

    public ArrayList<Bags> bags;

    public ArrayList<Bags> getBags() {
        return bags;
    }

    public HashMap<String, Object> getBooking() {
        return booking;
    }

    private int seatNo;
    private
    HashMap<String, Object> booking;

    public Passenger(String name,ArrayList<Bags> bags){
        this.name = name;
        this.bags = bags;
        this.seatNo = 0;
        this.booking = booking;
    }

    public void setBooking(HashMap<String, Object> booking) {
        this.booking = booking;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getName() {
        return name;
    }

    public int getNoOfBags() {
        return this.bags.size();
    }

    public double getTotalWeight() {
        return getNoOfBags() * Bags.getWeight();
    }
}
