package CoreJava;

import java.util.*;

public class NumtoChars {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a letter");
			char z = sc.next().charAt(0);
			char x = 97;
			char y = 65;
			for (int i = 1; i < 27; i++) {
				if (x == y) {
					System.out.println(z);
				}
				System.out.println(x++);
				System.out.println(y++);
			}
		}

	}

}
