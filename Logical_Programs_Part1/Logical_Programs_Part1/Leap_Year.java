package Logical_Programs_Part1;

public class Leap_Year {

	public static void main(String[] args) {
	int year=20;
		if(year % 4 == 0)
		{
			System.out.println("Leap Year");
		}
		else if (year % 400 == 0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
