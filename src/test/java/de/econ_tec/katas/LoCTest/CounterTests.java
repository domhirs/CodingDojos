package de.econ_tec.katas.LoCTest;

import de.econ_tec.katas.LoC.Counter;
import de.econ_tec.String.Constants.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTests {
    private final Counter _target = new Counter();

    @BeforeEach
    void setUp() {
    }

    @Test
    void linesOfCode_emptyString_0() {
        var expected = 0;

        int actual = _target.linesOfCode(Constants.STRING_EMPTY);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void linesOfCode_OneLineOfCode_1() {
        var expected = 1;
        var code = "AAAAA";

        int actual = _target.linesOfCode(code);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void linesOfCode_TwoLinesOfCode_2() {
        var expected = 2;
        var code = String.format("AAAAA %s BBBBB", Constants.NEWLINE);

        int actual = _target.linesOfCode(code);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void linesOfCode_OneLineOfCodeAndOneEmpty_1() {
        var expected = 1;
        var code = String.format("AAAAA %s", Constants.NEWLINE);

        int actual = _target.linesOfCode(code);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void linesOfCode_TwoLinesOfCodeAndOneEmpty_2() {
        var expected = 2;
        var code = String.format("AAAAA %s%s BBBBB", Constants.NEWLINE, Constants.NEWLINE);

        int actual = _target.linesOfCode(code);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void linesOfCode_TwoLinesOfCodeAndOneWhitespace_2() {
        var expected = 2;
        var code = String.format("AAAAA %s   %s BBBBB", Constants.NEWLINE, Constants.NEWLINE);

        int actual = _target.linesOfCode(code);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void linesOfCode_LineComment_1() {
        var expected = 0;
        var code = "//LineComment";

        int actual = _target.linesOfCode(code);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void linesOfCode_MultiLineComment_1() {
        var expected = 0;
        var code = "/*MultiLineComment*/";

        int actual = _target.linesOfCode(code);

        Assertions.assertEquals(expected, actual);
    }

}
