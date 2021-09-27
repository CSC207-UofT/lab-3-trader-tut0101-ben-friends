import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HelicopterTest {
    Helicopter BellB206JetRanger;

    @Before
    public void setUp() throws Exception {
        BellB206JetRanger = new Helicopter();
    }

    @Test(timeout = 50)
    public void TestSound(){assertEquals("bbbbbbbb!", BellB206JetRanger.sound());}

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(160,BellB206JetRanger.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetMaxAltitude() {
        assertEquals(25000, BellB206JetRanger.getMaxAltitude());
    }

    @Test(timeout = 50)
    public void TestGetMaxDistance() {
        assertEquals(250, BellB206JetRanger.getMaxDistance());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        BellB206JetRanger.upgradeSpeed();
        assertEquals(161, BellB206JetRanger.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        BellB206JetRanger.downgradeSpeed();
        assertEquals(159, BellB206JetRanger.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(700000, BellB206JetRanger.getPrice());
    }

}
