package Logical_Programs_Part1;

import java.util.*;
public class sum_of_number_is_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int rem=0,sum=0,c=0,count=0;
		while(n>0)
		{
			rem=n%10;
			c++;
			sum=sum+rem;
			n=n/10;
		}
		if(c>6)
		{
			for(int i=1; i<=sum; i++)
			{
				if(sum%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not prime");
			}
		}else
		{
			System.out.println("number length should be more than 6 digits");
		}

	}

}
