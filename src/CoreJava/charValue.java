package CoreJava;

import java.util.Scanner;

public class charValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter a Character to find code.");
		String ch = read.next();
		read.close();
		if(ch.length() != 1) System.out.println("Please Enter Single Character.");
		else {
			int c = (int)ch.charAt(0);
			if(c < 64 || c > 90) System.out.println("Your Special Character '"+ch+"' code is "+c);
			else System.out.println("Code for alphabet '"+ch+"' is '"+c+"'");
		}
		}
	}

