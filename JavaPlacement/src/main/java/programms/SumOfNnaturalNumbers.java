package programms;

import java.util.Scanner;

public class SumOfNnaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int sum=n*(n+1)/2;
		System.out.println("sum="+sum);
		sc.close();

	}

}
