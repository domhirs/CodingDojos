package de.econ_tec.katas.LoC;

import de.econ_tec.String.Constants.Constants;

import java.util.Objects;

public class Counter {
    public int linesOfCode(String code) {
        var codeLineCount = 0;
        var whitespaceLineCount = 0;
        var commentLineCount = 0;

        var lines = code.split(Constants.NEWLINE);

        for (var line : lines) {
            if (isMultiLineComment(line)) {
                commentLineCount++;
            }
            else if (isLineComment(line)) {
                commentLineCount++;
            }
            else if (isEmpty(line)) {
                whitespaceLineCount++;
            }
            else {
                codeLineCount++;
            }
        }

        return codeLineCount;
    }

    private boolean isMultiLineComment(String line) {
        return line.trim().startsWith("/*") && line.trim().endsWith("*/");
    }

    private boolean isLineComment(String line) {
        return line.trim().startsWith("//");
    }

    private static boolean isEmpty(String line) {
        return Objects.equals(line.trim(), "");
    }
}
