package package01;

public class Circle {
	
	double radius;
	double x, y;
	static double PI = 3.1415926;

	// default constructor
	Circle() {
		radius = 0.0;
		x = 0.0;
		y = 0.0;
	}
	
	// non-default constructor
	Circle(double r) {
		radius = r;
	}
	Circle(double x, double y) {
		this.x = x;
		this. y = y;
	}
	
	double getArea() {
		return radius * radius * PI;
	}
	
	double getPerimeter() {
		return 2.0 * radius * PI;
	}
	
	static double getPIDouble() {
		return PI * 2.0;
	}
	
}
