package ExceptionTesting;

public class SquareRoot {

        public double squareRoot(double value) {
            if(value < 0) {
                throw new IllegalArgumentException("Number must be greater than or equal to 0");
            }
            return Math.sqrt(value);
        }
}
