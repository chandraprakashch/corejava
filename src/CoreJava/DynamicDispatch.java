package CoreJava;

public class DynamicDispatch {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		
		A r = a;
		a.callme();
		
		r = b;
		b.callme();
		
		r = c;
		c.callme();
	}

}
