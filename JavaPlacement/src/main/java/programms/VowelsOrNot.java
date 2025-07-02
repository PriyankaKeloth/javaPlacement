package programms;

import java.util.Scanner;

public class VowelsOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter:");
		String s=sc.next();
		char c=s.charAt(0);
		switch(c)
		{
		  case 'a': System.out.println("it is a vowel");
		          break;
		  case 'e': System.out.println("it is a vowel");
		          break;
		  case 'i': System.out.println("it is a vowel");
		          break;
		  case 'o': System.out.println("it is a vowel");
		          break;
		  case 'u': System.out.println("it is a vowel");
		          break;
		  default: System.out.println("not a vowel");
		          break;
		         }  
		 sc.close();
		}

	}


