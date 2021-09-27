/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class CatTest {
    Cat myCat;

    @Before
    public void setUp() throws Exception {
       Cat myCat = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound() {assertEquals("Meow Meow!", myCat.sound()); }

    @Test(timeout = 50)
    public void TestGetPrice() {assertEquals(7, myCat.getPrice());}
}
