import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrewTest {

    Crew crew;

    @Before
    public void setUp() {
        crew = new Crew("bob", Ranks.CAPTAIN);
    }

    @Test
    public void setRank() {
        crew.setRank(Ranks.FIRSTOFFICER);
        assertEquals(Ranks.FIRSTOFFICER, crew.getRank());
    }

    @Test
    public void getName() {
        assertEquals("bob", crew.getName());
    }

    @Test
    public void getRank() {
        assertEquals(Ranks.CAPTAIN, crew.getRank());
    }

    public void playMessage(){
        assertEquals("planes fly enjoy", crew.relyMessage());
    }

}