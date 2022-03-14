package CoreJava;
	
public class VarargTest {

	static void vaTest(int... x) {
		System.out.println("length of the given array is :"+x.length);
		System.out.println("Contents are : ");
		for(int nos : x) {
			System.out.println(nos);
		}
	}
	
	static void vaTest(int a, int b, String... x) {
		System.out.println("value of a is :"+a);
		System.out.println("value of b is :"+b);
		System.out.println("length of the given array is :"+x.length);
		System.out.println("Contents are : ");
		for(String nos : x) {
			System.out.println(nos);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaTest(3, 5, 6, 9, 67, 4);
		vaTest(5,9, "one", "two", "three", "four", "five");
	}

}
