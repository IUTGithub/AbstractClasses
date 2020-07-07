public class mainClass {
	public static void main(String[] args) {
		Circle circle = new Circle(0.01, 0.01, 12.55);
		Rectangle rectangle = new Rectangle(2.01, 2.01, 10.5, 20.5);
		
		
		System.out.printf("%s", circle.toString());
		System.out.printf("%s", rectangle.toString());
	}
}
