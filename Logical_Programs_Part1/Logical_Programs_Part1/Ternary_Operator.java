package Logical_Programs_Part1;

public class Ternary_Operator {

	public static void main(String[] args) {
		int num=10, num2=20;
		System.out.println(num>num2?num+"greater":num+"lesser");
		int a = 10, b=20, c=30;
		//below sysout prints the greater number
		System.out.println(a>b?a>c?a:b:c);
	}

}
