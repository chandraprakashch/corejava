package CoreJava;

public class Rectangle extends Figure {
	
	Rectangle(double a, double b){
		super(a,b);
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		System.out.println("Inside Area of Rectangle");
		return dim1*dim2;
	}
}
