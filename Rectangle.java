
public class Rectangle extends Figure {
	private double rLength;
	private double rWidth;
	public Rectangle(double xcenter, double ycenter, double length, double width) {
		super(xcenter, ycenter);
		rLength = length;
		rWidth = width;
	}
	
	@Override
	public double getArea() {
		return (rLength * rWidth);
		
	}
	@Override
	public double getPerimeter() {
		return ((2 * rLength) + (2 * rWidth));
	}
	@Override
	public String toString() {
		return String.format("Rectangle with (%.2f,%.2f) [Area: %.2f], [Perimeter: %.2f]\n", centerX, centerY, this.getArea(), this.getPerimeter());
	}
}
