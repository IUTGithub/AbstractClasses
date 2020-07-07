
public abstract class Figure {
	protected double centerX;
	protected double centerY;
	
	public Figure(double xcenter, double ycenter) {
		centerX = xcenter;
		centerY = ycenter;
	}
	
	protected abstract double getArea();
	protected abstract double getPerimeter();
	
	public String toString() {
		return String.format("Figure with (%.2f,%.2f)\n", centerX, centerY);
	}
}
