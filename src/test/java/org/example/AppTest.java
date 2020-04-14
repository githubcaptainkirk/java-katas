package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AppTest {
    private App app;

    @Before
    public void setup() {
        app = new App();
    }

    @Test
    public void basicTests1() {
        doTest(100, 10, 910, 10);
    }

    @Test
    public void basicTests2() {
        doTest(10, 9, 4, 1);
    }

    private void doTest(int upSpeed, int downSpeed, int desiredHeight, int expected) {
        assertEquals(expected, App.growingPlant(upSpeed, downSpeed, desiredHeight));
    }

}
