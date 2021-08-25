package de.econ_tec.katas.FizzBuzzTests;

import de.econ_tec.katas.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    private final String BUZZ = "BUZZ";
    private final String FIZZ = "FIZZ";
    private final String FIZZBUZZ = "FIZZBUZZ";

    @Test
    public void Check_InputOne_ReturnsOne() {
        var target = new FizzBuzz();
        var expected = "1";

        String actual = target.check(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputTwo_ReturnsTwo() {
        var target = new FizzBuzz();
        var expected = "2";

        String actual = target.check(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputThree_ReturnsFizz() {
        var target = new FizzBuzz();

        String actual = target.check(3);

        Assertions.assertEquals(FIZZ, actual);
    }

    @Test
    public void Check_InputFour_ReturnsFour() {
        var target = new FizzBuzz();
        var expected = "4";

        String actual = target.check(4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputFive_ReturnsBuzz() {
        var target = new FizzBuzz();

        String actual = target.check(5);

        Assertions.assertEquals(BUZZ, actual);
    }

    @Test
    public void Check_InputSix_ReturnsFizz() {
        var target = new FizzBuzz();

        String actual = target.check(6);

        Assertions.assertEquals(FIZZ, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8})
    public void Check_ValueSource_ReturnsSameValue(int input) {
        var target = new FizzBuzz();
        String expected = Integer.toString(input);

        String actual = target.check(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputSeven_ReturnsSeven() {
        var target = new FizzBuzz();
        var expected = "7";

        String actual = target.check(7);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputEight_ReturnsEight() {
        var target = new FizzBuzz();
        var expected = "8";

        String actual = target.check(8);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputNine_ReturnsFizz() {
        var target = new FizzBuzz();

        String actual = target.check(9);

        Assertions.assertEquals(FIZZ, actual);
    }

    @Test
    public void Check_InputTen_ReturnsBuzz() {
        var target = new FizzBuzz();

        String actual = target.check(10);

        Assertions.assertEquals(BUZZ, actual);
    }

    @Test
    public void Check_InputFifteen_ReturnsFizzBuzz() {
        var target = new FizzBuzz();

        String actual = target.check(15);

        Assertions.assertEquals(FIZZBUZZ, actual);
    }

    @Test
    public void Check_InputThirty_ReturnsFizzBuzz() {
        var target = new FizzBuzz();

        String actual = target.check(30);

        Assertions.assertEquals(FIZZBUZZ, actual);
    }
}
