import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero myHero = new Hero("SuperModo", 8, "flying", "children");
        assertEquals(true, myHero instanceof Hero);
    }


    @Test
    public void Hero_instantiatesWithHeroName_String() {
        Hero myHero = new Hero("SuperModo", 8, "flying", "children");
        assertEquals("SuperModo", myHero.getheroName());
    }


    @Test
    public void Hero_instantiatesWithHeroAge_int() {
        Hero myHero = new Hero("SuperModo", 8, "flying", "children");
        assertEquals(8, myHero.getheroAge());
    }

    @Test
    public void Hero_instantiatesWithspecialPower_String() {
        Hero myHero = new Hero("SuperModo", 8, "flying", "children");
        assertEquals("flying", myHero.getspecialPower());
    }


    @Test
    public void Hero_instantiatesWithWeakness_String() {
        Hero myHero = new Hero("SuperModo", 8, "flying", "children");
        assertEquals("children", myHero.getweakness());
    }

    @Test
    public void getAll_returnAllinstancesofHeroObject_true() {
        Hero HeroOne = new Hero("SuperBrad", 6, "telekinesis", "crying");
        Hero HeroTwo = new Hero("Supersub", 9, "swords", "naughty");
        Hero HeroThree = new Hero("Flash", 7, "speed", "hunger");
        assertEquals(true,Hero.getAll().contains(HeroOne));
        assertEquals(true,Hero.getAll().contains(HeroTwo));
        assertEquals(true,Hero.getAll().contains(HeroThree));
    }

    @Test
    public void clear_clearsAllHerosinArray_0() {
        Hero myHero = new Hero("Supersub", 9, "swords", "naughty");
        Hero.clear();
        assertEquals(Hero.getAll().size(), 0);
    }

    @Test
    public void getId_HeroInstantiatiateswithId_1(){
    Hero.clear();
    Hero myHero = new Hero ("Supersub", 9, "swords", "naughty");
    assertEquals(1, myHero.getmId());
    }
}




