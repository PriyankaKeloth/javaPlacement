package programms;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the value of x:");
				int x = sc.nextInt();
				System.out.println("x=" + x);
				System.out.println("Enter the value of y:");
				int y = sc.nextInt();
				System.out.println("y=" + y);
				x = x + y;
				y = x - y;
				x = x - y;
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				sc.close();
			}

		

	}


