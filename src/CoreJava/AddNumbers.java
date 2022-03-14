package CoreJava;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("while entering numbers use comma in place of point:");
		System.out.println("Enter First Number");
		float firstNo = read.nextFloat();
		
		//while entering numbers use comma in place of point.
		Scanner read2 = new Scanner(System.in);
		System.out.println("Enter Second Number");
		float secondNo = read2.nextFloat();
		read2.close();read.close();
		
		System.out.println("Two numbers added are : "+(firstNo+secondNo));
		float a,b;
		a = 45.54f;
		b = 44.43f;
		System.out.println(a+b);
		
	}

}
