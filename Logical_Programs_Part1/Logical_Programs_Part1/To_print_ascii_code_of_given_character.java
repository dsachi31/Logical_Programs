package Logical_Programs_Part1;

public class To_print_ascii_code_of_given_character {

	public static void main(String[] args) {
		int num=10;
		switch(num%2) {
		case 0:
			{
				System.out.println("even");
				}
			break;
		default: System.out.println("odd");
		}
		char c='A';
		System.out.println((int)c);
		//even or odd using switch statement
		
		for(int i=0; i<5; i++)
		{
			System.out.println("MSD");
		}
		
	}

}
