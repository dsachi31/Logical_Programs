package day1;

import java.util.Scanner;

public class Day_one {
	public static void prime_check(int num)
	{
		int count=0;
		
		if(num==1 || num==0)
		{
			count++;
		}
		for(int i=2; i<num; i++)
		{
			if(num%i==0  )
			{
				count++;
			}	
		}
		if(count == 0)
		{
			System.out.println(num+" is Prime");
		}else
		{
			System.out.println(num+ " is not prime");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check prime");
		int n=sc.nextInt();
		prime_check(n);
//		System.out.println("hello");

	}

}
