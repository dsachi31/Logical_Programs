package Logical_Programs_Part1;

public class Find_Factors_of_n_number {

	public static void main(String[] args) {
		
		int n=7007;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
			
		}

	}

}
