package ExeptionTesting;

import org.testng.annotations.Test;

public class ArrayIndexTest {

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testGetElementAtIndex() {
        ArrayIndex arrayIndex = new ArrayIndex();
        int[] array = {1, 2, 3};
        int index = 3;
        arrayIndex.getElementAtIndex(array, index);
    }
}
