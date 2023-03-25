package day1;

import java.util.Scanner;

public class Prime_number {

	public static String check(long num)
	{
		long count=0;
		if(num == 1 || num == 0 )
		{
			count++;
		}
		for(long i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			return num+" is prime";
		}
		else
		{
			return num+" is not prime";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number to check for prime");
		long n=sc.nextInt();
		System.out.println(check(n));
		check(n);
	}

}
