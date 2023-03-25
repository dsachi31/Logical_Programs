package Logical_Programs_Part1;

public class break_stmt {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			if(i<=5)
				break;
			System.out.println(i);
			
		}
		System.out.println("***********");
		for(int j=1; j<=10; j++)
		{
			if(j==5 || j==6 || j==9)
			{
				continue;
			}
			System.out.println(j);
		}
	}
}
