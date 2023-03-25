package Logical_Programs_Part1;

import java.util.Scanner;

public class To_print_primenumbers_using_nested_forloop {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Starting number");
		int start = sc.nextInt();
		System.out.println("Enter Ending number");
		int end = sc.nextInt();
		int count=0;
		for(int i=start; i<=end; i++)
		{
			count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" ");
			}
		}
	}

}
