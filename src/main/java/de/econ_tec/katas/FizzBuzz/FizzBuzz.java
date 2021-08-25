package de.econ_tec.katas.FizzBuzz;

public class FizzBuzz {
    public String check(int input) {
        if (isFizz(input) && isBuzz(input)) {
            return "fizzbuzz".toUpperCase();
        }

        if (isBuzz(input)) {
            return "buzz".toUpperCase();
        }

        if (isFizz(input)) {
            return "fizz".toUpperCase();
        }

        return String.format("%s", input);
    }

    private boolean isBuzz(int input) {
        return input % 5 == 0;
    }

    private boolean isFizz(int input) {
        return input % 3 == 0;
    }
}
