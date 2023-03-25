package Logical_Programs_Part1;

import java.util.Scanner;
public class Reverse_primenumbers {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter starting number");
		int start= sc.nextInt();
		System.out.println("Enter ending number");
		int end=sc.nextInt();
		int count=0;
		for(int i=end; i>=start; i--)
		{
			count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(i+" ");
			}
		}
		
		
		

	}

}
