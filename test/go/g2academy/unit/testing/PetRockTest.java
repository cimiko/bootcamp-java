package go.g2academy.unit.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock rock = new PetRock("Rocky");

    @Test
    public void getName() throws Exception{
        String actual = rock.getName();
        assertEquals("Rocky", actual);
    }

    @Test
    public void testUnhappyToStart() {
        assertFalse(rock.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
        rock.playWithRock();
        assertTrue(rock.isHappy());
    }


}