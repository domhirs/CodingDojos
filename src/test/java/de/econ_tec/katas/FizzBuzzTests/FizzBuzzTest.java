package de.econ_tec.katas.FizzBuzzTests;

import de.econ_tec.katas.FizzBuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void Check_InputOne_ReturnsOne() {
        var target = new FizzBuzz();
        var expected = "1";

        String actual = target.check(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputTwo_ReturnsTwo() {
        var target = new FizzBuzz();
        var expected = "2";

        String actual = target.check(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputThree_ReturnsFizz() {
        var target = new FizzBuzz();
        var expected = "fizz";

        String actual = target.check(3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputFour_ReturnsFour() {
        var target = new FizzBuzz();
        var expected = "4";

        String actual = target.check(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Check_InputFive_ReturnsBuzz() {
        var target = new FizzBuzz();
        var expected = "buzz";

        String actual = target.check(5);

        Assert.assertEquals(expected, actual);
    }
}
