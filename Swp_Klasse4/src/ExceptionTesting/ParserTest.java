package ExceptionTesting;

import org.testng.annotations.Test;

public class ParserTest {
    @Test(expectedExceptions = InvalidNumberException.class)
    public void parseIntTest() throws InvalidNumberException {
        Parser parser = new Parser();
        parser.parseInt("abc");
    }
}
