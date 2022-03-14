package CoreJava;

public class Pat7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i <20; i++) {
			for(int b=1; b<=i; b++) {
				System.out.print("  ");
			} 
						
			for(int b=i; b<20; b++) {
				System.out.print(" X");
			} 
			
			for(int b=i; b<20; b++) {
				System.out.print(" X");
			}
			System.out.println();
		}
	}

}
