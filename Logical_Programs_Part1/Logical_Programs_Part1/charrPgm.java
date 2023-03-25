package Logical_Programs_Part1;

public class charrPgm {

	public static void main(String[] args) {
		
		char n='A';
		System.out.println(n);
		//below line n is a character added with 32nd character from n character which is defined and then displayed 
		//example n = 'A' = 65 ,n+=2, n=n(65)+2=67= char(67)='C'
		n+=32;
		System.out.println(n);
		System.out.println(n+32);
		System.out.println();
		int m=65;
		System.out.println((char)m);
		char t='A';
		System.out.println((int)t);
		System.out.println();
		
		////////////////////////////////////////////
		//using assignment operator inside the printing statement
		int D=0;
		System.out.println(D);
		//D=0;
		System.out.println(D+=D+10);
		int r=0101;
		System.out.println((char)r);
	}

}
