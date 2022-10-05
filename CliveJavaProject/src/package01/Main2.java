package package01;

public class Main2 {

	public static void main(String[] args) {
		
//		AYStudent.getSchoolIntroduction();
		
		System.out.println("Double of PI = " + Circle.getPIDouble());
		Circle c1 = new Circle();
//		c1.radius = 1.0;
		c1.x = 0.0;
		c1.y = 0.0;
		System.out.println("C1's area = " + c1.getArea());
		System.out.println("C1's perimeter = " + c1.getPerimeter());
		
		Circle c2 = new Circle(2.5);
		System.out.println("C2's area = " + c2.getArea());
		

	}

}
