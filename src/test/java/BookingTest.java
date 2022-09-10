import Flight.Booking;
import Flight.Location;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BookingTest {

    Booking booking;

    @Before
    public void setUp() {
       booking =  new Booking("123abc",Location.EDI, Location.DUB, new Date(2023-1900,01,07, 11,00,00));
    }

    @Test
    public void getTicket() {
      HashMap<String, Object> ticket = booking.getTicket();
      assertEquals("123abc", ticket.get("Flight.Flight Number"));
    }
}