package CoreJava;

class Outer {
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
		inner.showY();
		System.out.println("Value of y from outer class :"+inner.y);
	}
	
	class Inner{
		int y = 10;
		void display() {
			System.out.println("display : outer_x = "+outer_x);
		}
		
		void showY() {
			System.out.println("value of Y from inner class showY method:"+y);
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.test();
		System.out.println("Value of outer_x from main function :"+outer.outer_x);
		
		String c[] = {"one", "two", "three"};
		for(String x : c) {
			System.out.println(x);
		}
	}
}
