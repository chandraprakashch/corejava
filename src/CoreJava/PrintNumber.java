package CoreJava;

import java.util.Scanner;


public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter a Number :");
		Scanner read = new Scanner(System.in);
			int No  = read.nextInt();
			System.out.println("You entered :"+No);
			read.close();
	}		
}