import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("bob", Ranks.CAPTAIN, "123abc");
    }

    @Test
    public void getLicence() {
        assertEquals("123abc", pilot.getLicence());
    }

    @Test
    public void fly() {
        assertEquals("plane go brrrrr", pilot.fly());
    }
}