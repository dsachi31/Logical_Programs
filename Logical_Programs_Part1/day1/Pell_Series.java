package day1;

public class Pell_Series {

	public static void pell()
	{
		int n1=0, n2=1,n3=0;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0; i<10; i++)
		{
			n3=(n2*2)+n1;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		
		pell();


	}

}
