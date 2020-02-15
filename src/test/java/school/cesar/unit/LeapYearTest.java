package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void leapYear_DivisibleBy4_True() {
        Assertions.assertTrue(LeapYear.isLeapYear(16));
    }

    @Test
    public void leapYear_NotDivisibleBy100_False() {
        Assertions.assertFalse(LeapYear.isLeapYear(200));
    }

    @Test
    public void leapYear_NotDivisibleBy400_True() {
        Assertions.assertTrue(LeapYear.isLeapYear(800));
    }

    @Test
    public void leapYear_Else_False() {
        Assertions.assertFalse(LeapYear.isLeapYear(2020));
    }
}
