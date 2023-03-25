package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class AddArrayList {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		ArrayList<String> aa=new ArrayList<String>();
		aa.add("hello");
		aa.add("hii");
		System.out.println(aa);
		System.out.println("enter the element to be added");
		String st=sc.nextLine();
		aa.add(st);
		System.out.println(aa);

	}

}
