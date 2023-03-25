package Logical_Programs_Part1;

public class swap_numbers_without_thirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		/////without using third variable
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		int u=01010;
		System.out.println(u);
		if(u>100)
		{
			System.out.println("u is greater");
		}
		else
		{
			System.out.println("u is lesser");
		}
		
		/////////////check for the equal number without using = operator
		
		if(a>b || a<b) {
			System.out.println("not equal");
		}else
		{
			System.out.println("equal");
		}

	}

}
