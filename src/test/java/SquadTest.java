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

    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad( "SuperFive" ,5 ,"FightIlliteracy");
        Squad secondSquad = new Squad( "Panthers" ,5 ,"FightBullies");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }
    @Test
    public void Squad_instantiatesWithId_1() {
        Squad.clear();
        Squad mySquad = new Squad( "Panthers" ,5 ,"FightBullies");
        assertEquals(1, mySquad.getmId());
    }
    @Test
    public void getHero_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testSquad = new Squad( "Panthers" ,5 ,"FightBullies");
        assertEquals(0, testSquad.getHeroes().size());
    }
    @Test
    public void find_returnsNullWhenNoSquadFound_null() {
        assertTrue(Squad.find(999) == null);
    }
    @Test
    public void addHero_addsHeroToList_true() {
        Squad testSquad = new Squad( "Panthers" ,5 ,"fighting");
        Hero testHero = new Hero( "Mike" ,16 ,"fire" ,"cats");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testHero));
    }


}
