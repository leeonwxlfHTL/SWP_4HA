package ExceptionTesting;

public class UserSpec_Exception {
    public int calculateFactorial(int number) {
        if (number <= 0) {
            throw new NegativeNumberException("Number must be positive");
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
