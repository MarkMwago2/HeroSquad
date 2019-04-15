import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void Squad_instantiatesCorrectly_true() {
        Squad mySquad = new Squad("SuperFive", 5, "FightIlliteracy");
        assertEquals(true, mySquad instanceof Squad);
    }
}


