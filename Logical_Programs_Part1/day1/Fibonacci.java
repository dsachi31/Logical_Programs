package day1;

public class Fibonacci {

	public static void fib() {
int n1=0,n2=1;
int n3=n1+n2;
System.out.println(n1);
System.out.println(n2);
for(int i=0; i<10; i++)
{
	n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
}
	}
	
	public static void main(String[] args) {
		fib();

	}

}
