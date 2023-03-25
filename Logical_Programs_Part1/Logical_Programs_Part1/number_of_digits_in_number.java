package Logical_Programs_Part1;

public class number_of_digits_in_number {

	public static void main(String[] args) {
		long n=123789456;
		
		long rem,count=0;
		
		while(n>=1)
			{
			rem=n%10;
			count++;
			n=n/10;
			}
		System.out.println(count);
	}

}
