import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void Squad_instantiatesCorrectly_true() {
        Squad mySquad = new Squad("SuperFive", 5, "FightIlliteracy");
        assertEquals(true, mySquad instanceof Squad);
    }

    @Test
    public void Squad_instantiateswithName_String() {
        Squad mySquad = new Squad("SuperFive", 5, "FightIlliteracy");
        assertEquals("SuperFive", mySquad.getsquadName());
    }

    @Test
    public void Squad_instantiateswithSize_int() {
        Squad mySquad = new Squad("SuperFive", 5, "FightIlliteracy");
        assertEquals(5, mySquad.getsquadSize());
    }

    @Test
    public void Squad_instantiateswithCause_String() {
    Squad mySquad = new Squad ("SuperFive", 5, "FightIlliteracy");
    assertEquals("FightIlliteracy", mySquad.getsquadCause());
    }
}
