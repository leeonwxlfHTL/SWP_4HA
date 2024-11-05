package ExceptionTesting;

import org.testng.annotations.Test;

public class SquareRootTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSquareRoot() {
        SquareRoot squareRoot = new SquareRoot();
        squareRoot.squareRoot(-1);
    }
}
