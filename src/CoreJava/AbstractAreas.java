package CoreJava;

public class AbstractAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(5,10);
		Triangle t = new Triangle(10,4);
		Figure f;
		
		f = r;
		System.out.println("Area of Rectangle is : "+r.area());
		
		f = t;
		System.out.println("Area of Triangle is : "+t.area());
	}

}
