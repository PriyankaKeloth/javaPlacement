package programms;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) { //Program to find the factorial of given number.


		int n;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of the number= " + fact);
		sc.close();
	}

}
