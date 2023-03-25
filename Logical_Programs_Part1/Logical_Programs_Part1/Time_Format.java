package Logical_Programs_Part1;

import java.util.Scanner;
public class Time_Format {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time in minutes");
		long n =  sc.nextInt();
		float hours=(float)n/60;
		float minutes= (float)n%60;
		float seconds=(float)n*60;
		int day= (int)hours/24;
		int weeks = day/7;
		int month = day/30;
		int year = day/365;
		System.out.println(year+" y: "+month+" month: "+weeks+"w: "+day+"d: "+hours+" h: "+minutes+"m: "+seconds+"s");
				
	}

}
