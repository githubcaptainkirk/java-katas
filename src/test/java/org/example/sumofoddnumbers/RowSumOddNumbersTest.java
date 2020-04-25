package org.example.sumofoddnumbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RowSumOddNumbersTest {


    private RowSumOddNumbers rowSumOddNumbers;

    @Before
    public void setup() {
        rowSumOddNumbers = new RowSumOddNumbers();
    }

    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
    }

    @Test
    public void test2() {
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}