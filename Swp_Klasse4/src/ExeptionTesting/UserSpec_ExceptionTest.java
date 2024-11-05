package ExeptionTesting;

import org.testng.annotations.Test;

public class UserSpec_ExceptionTest {
    @Test(expectedExceptions = NegativeNumberException.class)
    public void testCalculateFactorial() {
        UserSpec_Exception userSpec = new UserSpec_Exception();
        userSpec.calculateFactorial(-1);

    }
}
