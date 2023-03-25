package Logical_Programs_Part1;

public class To_count_factor_of_n {

	public static void main(String[] args) {
		
		int m=1001, count=0;
		for(int i=1; i<=m; i++)
		{
			if(m%i==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("Count of Fctors of "+m+" = "+count );

	}

}
