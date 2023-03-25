package Day3;

import java.util.Scanner;

public class Simple_Calculator {
	
	public static int add(int[] arr, int num)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static int sub(int[] arr, int num)
	{
		int sub=0;
		for(int i=0; i<arr.length; i++)
		{
			sub-=arr[i];
		}
		return sub;
	}

	public static void main(String[] args) {
		
		System.out.println("============Simple Calculator==========\n");
		System.out.println("Please Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("==========Menu=========");
		System.out.println(" 1 .Add 2.Sub  3.Mul  4.Div  5.Mod  6.Exit");
		System.out.println("Enyer the Options");
		int option=sc.nextInt();
		if(option==1) {
			
		}
		
		
		

	}

}
