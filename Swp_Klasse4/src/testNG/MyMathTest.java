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
	  Assert.assertEquals(result, 6);
  }
  
  @Test
  public void testMultiplication() {
	  MyMath math = new MyMath();
	  int result = math.multiply(3, 5);
	  Assert.assertEquals(result, 15);
  }
  
  @Test
  public void testDivision() {
	  MyMath math = new MyMath();
	  int result = math.divide(5, 2);
	  Assert.assertEquals(result, 2);
  }
  
  @Test
  public void testDoubleDivision() {
	  MyMath math = new MyMath();
	  double result = math.divide(1D, 3D);
	  Assert.assertEquals(result, 1D/3D);
  }
  
  @Test
  public void testComparison() {
	  MyMath math = new MyMath();
	  boolean result = math.comparison(40, 10);
	  Assert.assertEquals(result, true);
  }
  
}
