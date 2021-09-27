/*
Contains sample junit tests for the cow class
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Moo!", c.sound());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(10000001, c.getMaxSpeed());
    }
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, c.getPrice());
    }
}
