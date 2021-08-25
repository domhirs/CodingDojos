package de.econ_tec.katas.FizzBuzz;

public class Application {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            var fizzBuzz = new FizzBuzz();
            System.out.println(fizzBuzz.check(i));
        }
    }
}
