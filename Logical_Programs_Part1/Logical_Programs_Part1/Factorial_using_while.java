package Logical_Programs_Part1;

import java.util.*;
public class Factorial_using_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check its factorial");
		long n = sc.nextInt();
		long i=1,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+n+" = "+ fact);
	}

}
