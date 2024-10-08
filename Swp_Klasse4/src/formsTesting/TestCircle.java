package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import testNG.MyMath;

public class TestCircle {

    @Test
    public void testGetRadius() {
        Circle circle = new Circle(0, 0, 5);
        double result = circle.getRadius();
        Assert.assertEquals(result, 5.0);
    }
    @Test
    public void testSetRadius() {
        Circle circle = new Circle(0, 0, 5);
        circle.setRadius(10);
        double result = circle.getRadius();
        Assert.assertEquals(result, 10.0);
    }

    @Test
    public void testCalculateArea() {
        Circle circle = new Circle(0, 0, 5);
        double result = circle.calculateArea();
        Assert.assertEquals(result, 25*Math.PI);
    }
    @Test
    public void testCalculateCircumference() {
        Circle circle = new Circle(0, 0, 5);
        double result = circle.calculateCircumference();
        Assert.assertEquals(result, (5*2)*Math.PI);
    }
    @Test
    public void testToString() {
        Circle circle = new Circle(0, 0, 5);
        String result = circle.toString();
        Assert.assertEquals(result, "Circle (0.0|0.0) with radius = 5.0");
    }

}

