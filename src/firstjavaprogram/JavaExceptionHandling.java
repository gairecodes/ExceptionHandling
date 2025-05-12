package firstjavaprogram;

import java.util.Scanner;

public class JavaExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=0;
		
		System.out.println("enter the divident");
		int a = sc.nextInt();
		
		System.out.println("enter the divisor");	
		int b = sc.nextInt();
		
		try {
			result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("exception occured "+e.getMessage());
			return;
		}
		System.out.println("the answer for the divison is:"+result);
		

}
}
