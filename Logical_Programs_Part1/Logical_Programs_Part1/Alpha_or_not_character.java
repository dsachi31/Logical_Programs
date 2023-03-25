package Logical_Programs_Part1;

public class Alpha_or_not_character {

	public static void main(String[] args)
	{
		char c='1';
		if(c>='A' && c<='Z' || c>='a' && c<='z')
		{
			System.out.println("not special character "+"c is  alpha");
		}else if(c>='0' && c<='9')
		{
			System.out.println("not special character "+"c is number");
		}else
		{
			System.out.println("c is special character");
		}
	}
}
