import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarTest_2 {
    public Car car;

    @Before
    public void setUp() {
        car = new Car(100, 10000);
    }

    @Test
    public void TestUpgradeSpeed() {
        int expected = 110;
        car.upgradeSpeed();
        int actual = car.getMaxSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void TestDowngradeSpeed() {
        int expected = 90;
        car.downgradeSpeed();
        int actual = car.getMaxSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void TestGetMaxSpeed() {
        assertEquals(100, car.getMaxSpeed());
    }

    @Test
    public void TestGetPrice() {
        assertEquals(10000, car.getPrice());
    }
}