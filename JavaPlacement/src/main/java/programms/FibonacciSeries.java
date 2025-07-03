package programms;

public class FibonacciSeries { //Program to print Fibonacci series.


	public static void main(String[] args) {
		 int limit = 10;
		   int first= 0;
		   int second = 1;  // 0,1,1,2,3,5,8,13
		   System.out.println("Fibonacci series: " );
		for (int i = 0; i <= limit; i++) {
			
			 System.out.print(first + " ");
			int sum = first + second;
			first = second;
			second = sum;
           
		  
		}

	}

}
