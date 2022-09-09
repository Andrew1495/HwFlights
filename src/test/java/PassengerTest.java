import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Bags bag;
    @Before
    public void setUp() {
        passenger = new Passenger("bob",new ArrayList<Bags>());
        passenger.bags.add(bag);
    }

    @Test
    public void hasName(){
        assertEquals("bob", passenger.getName());
    }

    @Test
    public void hasBagCount(){
        assertEquals(1 , passenger.getNoOfBags());
    }

    @Test
    public void bagTotalWeight(){
        assertEquals(5.00, passenger.getTotalWeight(),0.0);
    }



}