package formsTesting;

public class Square extends Form {
	
	private Rectangle rectangle;
	
	public Square(double x, double y, double width) {
		super(x, y);
		rectangle = new Rectangle(x,y,width,width);
	}

	public Rectangle getRectangle() {
		return this.rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		rectangle = this.rectangle;
	}

	public double calculateArea() {
		return this.rectangle.calculateArea();
	}

	public double calculateCircumference() {
		return this.rectangle.calculateCircumference();
	}
	
	public String toString() {
		return "Square (" + this.getX() + "|" + this.getY() + ") with width = " 
					+ this.rectangle.getWidth();
	}
	

}
