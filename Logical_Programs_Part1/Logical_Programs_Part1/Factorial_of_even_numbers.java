package Logical_Programs_Part1;

import java.util.Scanner;
public class Factorial_of_even_numbers {

	public static void main(String[] args) {
		long fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Even number");
		long n = sc.nextInt();
		if(n%2==0) 
		{
			for(long i=1; i<=n; i++)
			{
				fact=fact*(i);
			}
			System.out.println(fact);
		}
		else
		{
			System.out.println("The number must be even number");
		}
	}

}
