package org.example.halvingsum;
import org.example.sumofoddnumbers.RowSumOddNumbers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HalvingSumTest {

    private HalvingSum halvingSum;

    @Before
    public void setup() {
        halvingSum = new HalvingSum();
    }

    @Test
    public void test1() {
        assertEquals(47, halvingSum.halvingSum(25));
    }

    @Test
    public void test2() {
        assertEquals(247, halvingSum.halvingSum(127));
    }


}




