package CoreJava;

public class Swasthik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1; a<10; a++) {
			System.out.print(" X");
		}

		for(int a=1; a<9; a++) {
			System.out.print("  ");
		}
		System.out.println(" X");
		
		for(int a=1; a<6; a++) {
			for(int b=1; b<9; b++) {
				System.out.print("  ");
			}
			System.out.print(" X");
		
			for(int b=1; b<9; b++) {
				System.out.print("  ");
			}
			System.out.println(" X");
		}
		
		
		for(int b=1; b<9; b++) {
			System.out.print(" X");
		}
		for(int b=0; b<10; b++) {
			System.out.print(" X");
		}
		System.out.println();
		
		for(int a=0; a<6; a++) {
			
			System.out.print(" X");
		
			for(int b=2; b<9; b++) {
				System.out.print("  ");
			}
			if(a==5) {
				System.out.print(" X");
				for(int b=0; b<9; b++) {
					System.out.print(" X");
				}
			}else 
			System.out.println(" X");
		}
	}
}


