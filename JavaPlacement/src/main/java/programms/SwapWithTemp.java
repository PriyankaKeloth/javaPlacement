package programms;

public class SwapWithTemp {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
