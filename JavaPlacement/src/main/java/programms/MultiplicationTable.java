package programms;

import java.util.Scanner;

public class MultiplicationTable { //Print multiplication table of given number.


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print multiplication table: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }

	}


