package Flight;
import java.util.ArrayList;
import java.util.HashMap;

public class Passenger {
    private String name;

    private ArrayList<Bags> bags;

    public ArrayList<Bags> getBags() {
        return bags;
    }

    public HashMap<String, Object> getBooking() {
        return booking;
    }

    private int seatNo;
    private int noOfBags;
    private
    HashMap<String, Object> booking;

    public Passenger(String name, int noOfBags){
        this.name = name;
        this.noOfBags = noOfBags;
        this.bags = addBags();
        this.seatNo = 0;
        this.booking = booking;
    }

    private ArrayList<Bags> addBags(){
       ArrayList<Bags> makeBags = new ArrayList<>();
        for (int i = 0; i < this.noOfBags ; i++) {
            makeBags.add(new Bags(i));
        }
        return makeBags;
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
