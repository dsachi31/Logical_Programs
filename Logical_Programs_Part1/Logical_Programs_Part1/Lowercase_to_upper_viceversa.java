package Logical_Programs_Part1;

public class Lowercase_to_upper_viceversa {

	public static void main(String[] args) {
	
		char c='Y';
		if(c>='A' && c<='Z')
		{
			c+=32;
			System.out.println("C = "+c);
		}
		else if(c>='a' && c<='z')
		{
			c-=32;
			System.out.println("C = "+c);
		}else
		{
			System.out.println("enter the proper Alphabet");
		}

	}

}
