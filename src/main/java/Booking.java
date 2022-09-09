import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;

public class Booking {

    private String flightNo;
    private Location dept;
    private Location dest;
    private Date deptTime;

    private HashMap<String, Object> ticket;


    public HashMap<String, Object> getTicket() {
        return this.ticket;
    }

    public Booking(String flightNo, Location dept, Location dest, Date deptTime){
        this.flightNo = flightNo;
        this.dept = dept;
        this.dest = dest;
        this.deptTime = deptTime;
        this.ticket = makeTicket();
    }

    public HashMap<String, Object> makeTicket(){
        HashMap<String, Object> temp = new HashMap<String, Object>();
        temp.put("Flight Number", flightNo);
        temp.put("Departure", dept);
        temp.put("Destination", dest);
        temp.put("Departure Tome", deptTime);
        return temp;
    }


}
