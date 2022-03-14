package ExceptionHandling;
import java.util.Random;

public class HandleError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		
		Random r = new Random();
		
		for(int i = 0; i < 32000; i++) {
			try{
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b * c);
			} catch(ArithmeticException e){
				System.out.println("Dividion By Zero");
				a = 0;
			}
			System.out.println("a : "+a+",\t  Equation : B :"+b+",\t C : "+c+", \t B X C : "+(b*c));
		}
	}

}
