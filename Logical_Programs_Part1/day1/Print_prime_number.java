package day1;

public class Print_prime_number {

	
	public static void print(int m,int n)
	{
		int count=0;
		for(int i=2; i<m; i++)
		{
		for(int j=m; i<n; i++)
		{
			if(n%j==0)
			{
				count++;
			}
		}
		}
		System.out.println(m);
	}
	public static void main(String[] args) {
		print(10,20);

	}

}
