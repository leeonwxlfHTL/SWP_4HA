package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSquare {


    @Test
    public void testAreaCalc(){
        Square s = new Square(5,3, 10);
        double areaResult = s.calculateArea();
        Assert.assertEquals(areaResult, 100.0);
    }
    @Test
    public void testCircumferenceCalc(){
        Square s = new Square(5,3, 10);
        double areaResult = s.calculateCircumference();
        Assert.assertEquals(areaResult, 40.0);
    }
    @Test
    public void testToString() {
        Square s = new Square(5,3, 10);
        String result = s.toString();
        Assert.assertEquals(result, "Rectangle (5.0|3.0) with width = 10.0 and length = 10.0");
    }
    @Test
    public void testAreaCalc1(){
        Square s = new Square(0,6, 1);
        double areaResult = s.calculateArea();
        Assert.assertEquals(areaResult, 1.0);
    }
    @Test
    public void testCircumferenceCalc1(){
        Square s = new Square(0,6, 1);
        double areaResult = s.calculateCircumference();
        Assert.assertEquals(areaResult, 4.0);
    }

    @Test
    public void testToString1() {
        Square s = new Square(0,6, 1);
        String result = s.toString();
        Assert.assertEquals(result, "Rectangle (0.0|6.0) with width = 1.0 and length = 30.0");
    }
}
