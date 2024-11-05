package ExeptionTesting;

import com.sun.jdi.InvalidLineNumberException;

public class Parser {
    public int parseInt(String value) throws InvalidNumberException {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid number format");
        }
    }

}
