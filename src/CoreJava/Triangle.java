package CoreJava;

public class Triangle extends Figure {
	
	Triangle(double a, double b){
		super(a,b);
	}
	@Override
	double area() {
		System.out.println("Inside Area of Triangle");
		// TODO Auto-generated method stub
		return dim1 * dim2 / 2;
	}

}
