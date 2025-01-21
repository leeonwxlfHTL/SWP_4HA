package designPatternComposit.Shapes;

public class ComposedShape extends Shape {

    private List<Shape> shapes;

    public ComposedShape() {
        shapes = new ArrayList<Shape>();
    }


    public void display() {
       for(Shape shape : shapes)
           shape.display();
    }

    @Override
    public void add(Shape shape) {
        this.shapes.add(shape)
    }
}
