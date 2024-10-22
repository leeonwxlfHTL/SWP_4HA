package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroup {

    @Test
    public void calculateArea() {
        Group g = new Group();

        Circle c = new Circle(0,0,3);
        Square s = new Square(0,0,3);
        Rectangle r = new Rectangle(0,0,3,3);

        g.addForm(c);
        g.addForm(s);
        g.addForm(r);

        Assert.assertEquals(g.calculateArea(),(c.calculateArea()+s.calculateArea()+r.calculateArea()));
    }

    @Test
    public void calculateArea2() {
        Group g = new Group();

        Circle c = new Circle(0,0,2);
        Square s = new Square(0,0,2);
        Rectangle r = new Rectangle(0,0,2,2);

        g.addForm(c);
        g.addForm(s);
        g.addForm(r);

        Assert.assertEquals(g.calculateArea(),(c.calculateArea()+s.calculateArea()+r.calculateArea()));
    }

    @Test
    public void calculateCircumference() {
        Group g = new Group();

        Circle c = new Circle(0,0,3);
        Square s = new Square(0,0,3);
        Rectangle r = new Rectangle(0,0,3,3);

        g.addForm(c);
        g.addForm(s);
        g.addForm(r);

        Assert.assertEquals(g.calculateCircumference(),(c.calculateCircumference()+s.calculateCircumference()+r.calculateCircumference()));
    }

    @Test
    public void calculateCircumference2() {
        Group g = new Group();

        Circle c = new Circle(0,0,2);
        Square s = new Square(0,0,2);
        Rectangle r = new Rectangle(0,0,2,2);

        g.addForm(c);
        g.addForm(s);
        g.addForm(r);

        Assert.assertEquals(g.calculateCircumference(),(c.calculateCircumference()+s.calculateCircumference()+r.calculateCircumference()));
    }



}
