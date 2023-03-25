package day1;

public class Factorial {

	public static int factorial(int num)
	{
		if(num==1)
		{
			return 0;
		}else
		{
			return num*factorial(num-1);
		}
	}
	public static void main(String[] args) {
		int fact=1,f=1;
		for(int i=1; i<10; i++)
		{
			f=i+factorial(5);
		}
		System.out.println(f);

	}

}
