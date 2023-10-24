import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isLeapYearTests {

    @ParameterizedTest
    @MethodSource("leapYears")
    public void test_years_divided_by_four_and_not_hundred_is_a_leap_year(int input) {
        assertTrue(DivideBy.isLeapYear(input));
    }

    @ParameterizedTest
    @MethodSource("leapYears")
    public void test_years_divided_by_fourhundred_is_a_leap_year(int input) {
        assertTrue(DivideBy.isLeapYear(input));
    }

    @ParameterizedTest
    @MethodSource("notLeapYears")
    public void test_years_not_dividable_by_four_are_not_leap_years(int input) {
        assertFalse(DivideBy.isLeapYear(input));
    }

    @ParameterizedTest
    @MethodSource("notLeapYears")
    public void test_years_dividable_by_hundred_but_not_fourhundred_are_not_leap_years(int input) {
        assertFalse(DivideBy.isLeapYear(input));
    }

    /*@Test
    public void test_that_will_fail() {
        assertFalse(DivideBy.isLeapYear(1999));
    }*/

    public static Stream<Arguments> leapYears() {
        return Stream.of(
                Arguments.of(2000),
                Arguments.of(2004),
                Arguments.of(2008)
        );
    }

    public static Stream<Arguments> notLeapYears() {
        return Stream.of(
                Arguments.of(2001),
                Arguments.of(1900),
                Arguments.of(2013)
        );
    }
}