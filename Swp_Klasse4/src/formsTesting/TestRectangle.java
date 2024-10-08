package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRectangle {


    @Test
    public void testAreaCalc(){
        Rectangle r = new Rectangle(5,3, 10, 5);
        double areaResult = r.calculateArea();
        Assert.assertEquals(areaResult, 50.0);
    }
    @Test
    public void testCircumferenceCalc(){
        Rectangle r = new Rectangle(5,3, 10, 5);
        double areaResult = r.calculateCircumference();
        Assert.assertEquals(areaResult, 30.0);
    }
    @Test
    public void testToString() {
        Rectangle r = new Rectangle(5,3, 10, 5);
        String result = r.toString();
        Assert.assertEquals(result, "Rectangle (5.0|3.0) with width = 10.0 and length = 5.0");
    }
    @Test
    public void testAreaCalc1(){
        Rectangle r = new Rectangle(0,6, 1, 30);
        double areaResult = r.calculateArea();
        Assert.assertEquals(areaResult, 30.0);
    }
    @Test
    public void testCircumferenceCalc1(){
        Rectangle r = new Rectangle(0,6, 1, 30);
        double areaResult = r.calculateCircumference();
        Assert.assertEquals(areaResult, 62.0);
    }

    @Test
    public void testToString1() {
        Rectangle r = new Rectangle(0,6, 1, 30);
        String result = r.toString();
        Assert.assertEquals(result, "Rectangle (0.0|6.0) with width = 1.0 and length = 30.0");
    }
}
