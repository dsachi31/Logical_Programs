package Logical_Programs_Part1;

public class print_1to10_using_while {

	public static void main(String[] args) {
		int i=1, j=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println(" ");
		////////////
		do {
			System.out.print(j+" ");
			j++;
		}while(j<=10);

	}

}
