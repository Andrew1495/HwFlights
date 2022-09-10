import Flight.Plane;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    @Test
    public void getWeight() {
        assertEquals(400,Plane.BOEING101.getWeight(),0.0);
    }

    @Test
    public void getCapacity() {
        assertEquals(100, Plane.BOEING303.getCapacity());
    }

}