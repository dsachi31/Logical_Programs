package Logical_Programs_Part1;

public class sum_of_given_evennumber {

	public static void main(String[] args) {
		int num=11111111, temp=num;
		int rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			num=num/10;
		}
		System.out.println("Number = "+temp+" Sum of Even under the given number = "+sum);

	}

}
