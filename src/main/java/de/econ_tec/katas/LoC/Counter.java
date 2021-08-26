package de.econ_tec.katas.LoC;

import de.econ_tec.String.Constants.Constants;

import java.util.Objects;

public class Counter {
    public int linesOfCode(String code) {
        var res = 0;
        var lines = code.split(Constants.NEWLINE);

        for (var line : lines) {
            if (isEmpty(line)) {
                res += 0;
            }
            else {
                res++;
            }
        }

        return res;
    }

    private static boolean isEmpty(String line) {
        return Objects.equals(line, "");
    }
}
