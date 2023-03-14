package session05;

public class Circle {
	double radius = 1;
	
	Circle(){
		
	}
	
	Circle(double newRadius){
		radius = newRadius;
	}
	
//	Methods
	double getArea() {
		return radius * radius * Math.PI;
	}
//	Methods 2
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
