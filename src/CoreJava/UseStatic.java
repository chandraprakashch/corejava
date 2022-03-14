package CoreJava;

public class UseStatic {

	static int a=3;
	static int b;
	static void meth(int x) {
		System.out.println("value of x is :"+x);
		System.out.println("value of a is :"+a);
		System.out.println("value of b is :"+b);
	}

	static {
		System.out.println("Static Block Inittiated");
		b=a*5;
		a=20;
		b=50;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth(42);
		System.out.println("calling with class ref : "+UseStatic.a);
	}
}
