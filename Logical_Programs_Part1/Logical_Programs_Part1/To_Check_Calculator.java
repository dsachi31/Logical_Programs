package Logical_Programs_Part1;

import java.util.Scanner;
public class To_Check_Calculator {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int option=0;
	if(n>1) {
	System.out.println("enter the "+n+" elements");
		int[] a=new int[n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Choose one Math-Operation below...");
		System.out.println("Press \n1.To Add \n2.To Subtract \n3.To Multiply \n4.To Divide");
		 option=sc.nextInt();
		if(option==1)
		{
			int sum=0;
			for(int i=0; i<a.length; i++)
			{
				sum=sum+a[i];
			}
			System.out.println("Result = "+sum);
		}else if(option==2)
		{
			int sub=0;
			for(int i=0; i<a.length; i++)
			{
				sub=a[i]-sub;
			}
			System.out.println("Result = "+sub);
		}else if(option==3)
		{
			int mul=1;
			for(int i=0; i<a.length; i++)
			{
				mul=mul*a[i];
			}
			System.out.println("Result = "+mul);
		}
		
		}
	else
	{
		System.out.println("number of elements size is lesser");
	}
	int p=10,o=20;
	int res=p-o;
	System.out.println(res);

	}

}
