package CoreJava;

public class Pat8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i <20; i++) {
			for(int b=1; b<i; b++) {
				System.out.print(" X");
			} 
			System.out.println();
		}
		
		for(int i=1; i <20; i++) {
			for(int b=i; b<20; b++) {
				System.out.print(" X");
			} 
			System.out.println();
		}
	}

}
