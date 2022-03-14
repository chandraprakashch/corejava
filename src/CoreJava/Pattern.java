package CoreJava;

public class Pattern{

	public static void main(String[] rg) {
		
		for(int a =1; a<10; a++) {
			
			for(int b=1; b<=a; b++) {
				System.out.print("  ");
			}
			System.out.print("X");
			
			for(int i=a*2; i<19; i++) {
				System.out.print("  ");
			}
			System.out.println("X");	
		}
		
		
		for(int c=1; c<10; c++) {
			System.out.print("  ");
		}
		System.out.println(" X");
		
		//second curve
		for(int a =1; a<10; a++) {
		
			for(int i=9; i>=a; i--) {
				System.out.print("  ");
			}
			System.out.print("X");	

			for(int b=1; b<(a*2);b++) {
				System.out.print("  ");
			}
			System.out.println("X");

		}
	
}

}