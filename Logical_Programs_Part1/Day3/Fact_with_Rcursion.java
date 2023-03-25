package Day3;

public class Fact_with_Rcursion {
	
	public static long f(long num)
	{
		if(num==1)
		{
			return 1;
		}
		else {
			return num*f(num-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(f(10));
	}

}
