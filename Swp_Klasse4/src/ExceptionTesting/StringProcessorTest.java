package ExceptionTesting;

import org.testng.annotations.Test;

public class StringProcessorTest {

    @Test(expectedExceptions = NullPointerException.class)
    public void testReverse() {
        StringProcessor sp = new StringProcessor();
        sp.reverse(null);
    }
}
