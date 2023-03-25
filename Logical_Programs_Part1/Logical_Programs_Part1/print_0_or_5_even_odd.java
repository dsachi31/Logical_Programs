package Logical_Programs_Part1;

import java.util.Scanner;
public class print_0_or_5_even_odd {

	public static void main(String[] args) {
		int rem=0,temp=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
			rem=n%10;
			if(rem==0 || rem==5) {
				System.out.println(rem);
			}else
			{
				if(n%2==0)
				{
					System.out.println("Even");
				}
				else
				{
					System.out.println("Odd");
				}
			}
	}

}
