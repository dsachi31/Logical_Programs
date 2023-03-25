package Logical_Programs_Part1;

public class Prime_or_not {

	public static void main(String[] args) {
		
		int yoyo=100, count=0;
		for(int i=1; i<=yoyo; i++)
		{
			if(yoyo%i==0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
