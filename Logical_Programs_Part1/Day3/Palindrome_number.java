package Day3;


public class Palindrome_number {
	public static void check(int num) {
		int rem=0,res=0,temp=num;
		
		while(temp>0) 
		{
		rem=temp%10;
		res=res*10+rem;
		temp=temp/10;
		}
		if(res==num)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		
check(12321);
	}

}
