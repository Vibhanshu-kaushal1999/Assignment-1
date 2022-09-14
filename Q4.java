package vibk;

public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q4 - Write a Java program to swap the values of integer number with using temporary variable and without using temporary variable.
		
		// Using Temp Variable
		int a =5 ; 
		int b = 6 ; 
		int temp ; 
		
		temp = a  ;
		a=b ; 
		b = temp ; 
		System.out.println("After swapping a = " + a);
		System.out.println("After swapping b = " + b);
		
		System.out.println("-----------------------------------------------------------------------");
		
		// Without Using Temp Variable Method-1
		
		int x = 10 ; 
		int y = 15  ; 
		x = x+y ; 
		y = x-y ; 
		x = x-y ; 
		System.out.println("After swapping x = " + x);
		System.out.println("After swapping y = " + y);
		
		System.out.println("-----------------------------------------------------------------------");
		
		// Without Using Temp Variable Method-2
		
		int k = 4 ; 
		int l = 9 ; 
		
		k = k^l ; 
		l = k^l ; 
		k = k^l ; 
		System.out.println("After swapping K = " + k);
		System.out.println("After swapping l = " + l);
		
		
		
		
		
		
		
		
		

	}

}
