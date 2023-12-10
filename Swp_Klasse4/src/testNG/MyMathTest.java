package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMathTest {

  @Test
  public void testAddition() {
	  MyMath math = new MyMath();
	  int result = math.add(3, 5);
	  Assert.assertEquals(result, 8);
  }
  
  @Test
  public void testSubtraction() {
	  MyMath math = new MyMath();
	  int result = math.subtract(10, 4);
	  Assert.assertEquals(result, 5);
  }
}
