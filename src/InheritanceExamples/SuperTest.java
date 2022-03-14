package InheritanceExamples;

public class SuperTest {
	public static void main(String args[]) {
		
		WeightBox obj1 = new WeightBox(2,3,4,5);
		WeightBox obj2 = new WeightBox(5, 5);
		WeightBox obj3 = new WeightBox();
		WeightBox clone = new WeightBox(obj1);
		
		System.out.println("vol of object 1 : "+ obj1.volume());
		System.out.println("Dimensions : W = "+obj1.w()+", H = "+obj1.h()+", D = "+obj1.d());
		
		System.out.println("vol of object 2 : "+ obj2.volume());
		System.out.println("Dimensions : W = "+obj2.w()+", H = "+obj2.h()+", D = "+obj2.d());
		
		System.out.println("vol of object 3 : "+ obj3.volume());
		System.out.println("Dimensions : W = "+obj3.w()+", H = "+obj3.h()+", D = "+obj3.d());
		
		System.out.println("vol of object clone : "+ clone.volume());
		System.out.println("Dimensions : W = "+clone.w()+", H = "+clone.h()+", D = "+clone.d());
		
		System.out.println("Is clone equal to object 1 : "+obj1.equals(clone));
	}
}
