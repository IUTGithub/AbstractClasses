public class Circle extends Figure {
	private double cRadius;
	public Circle (double xcenter, double ycenter, double radius) {
		super(xcenter, ycenter);
		cRadius = radius;
	}
	
	@Override
	public double getArea() {
		return (Math.PI * cRadius * cRadius);
	}
	
	@Override
	public double getPerimeter() {
		return (2 * Math.PI * cRadius);
	}
	
	@Override
	public String toString() {
		return String.format("Circle with (%.2f,%.2f) [Area: %.2f], [Perimeter: %.2f]\n", centerX, centerY, this.getArea(), this.getPerimeter());
	}
	
}
