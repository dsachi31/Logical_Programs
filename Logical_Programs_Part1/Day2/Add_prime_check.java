package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Add_prime_check {
	public static void check(short num)
	{
		short rem=0,rem1=0,sum=0;
		short count=0;
		
		
		/*****************************************************/
		//Write operation in file
//		try {
//		FileWriter f1=new FileWriter("C:\\LogicalClass\\EvenOdd.java");
//		f1.write("hiii");
//		f1.write("hello");
//		f1.close();
//		System.out.println("successfully wrote a file");
//		
//		}
//		catch(IOException ie)
//		{
//			System.out.println("an error occured");
//			ie.printStackTrace();
//		}
			rem=(short)(num%10000);
			System.out.println(rem);
			short temp=rem;
			while(temp>0){
			rem1=(short)(temp%10);
			sum=(short)(sum+rem1);
			temp=(short)(temp/10);
			}
			if(sum == 1 || sum == 0)
			{
				count++;
			}
			for(short i=2; i<sum; i++)
			{
				if(sum%i==0)
				{
					count++;
				}
				else
				{
					count=0;
				}
			}
			if(count==0)
			{
				System.out.println("sum of "+rem1+" = "+sum+" is Prime");
			}
			else
			{
				System.out.println("sum of "+rem1+" = "+sum+" is Not prime");
			}
	}
	public static void main(String[] args) {	
//		check((short)7673);
//		check((short)7672);
//		check((short)10001);
//		check((short)0000);
		/*****************************************************/
		
		//Read operation in file
//		try {
//		File fr = new File("C:\\LogicalClass\\EvenOdd.java");
//		Scanner sc =new Scanner(System.in);
//		while(sc.hasNext()) {
//		String s1 = sc.next();
//		System.out.println(s1);
//		}
//			sc.close();
//		}
//		catch(Exception ie)
//		{
//			System.out.println("Error occured");
//			ie.printStackTrace();
//		}

		
		/*****************************************************/
		//Delete operation using FileHandling concept
		File del=new File("C:\\Users\\Divya\\Desktop\\justprint.java");
		Scanner scc=new Scanner(System.in);
		if(del.exists())
		{
			
			
			System.out.println("the file you are searching for is present in your system..");
			System.out.println("do you want to delete..?");
			System.out.println("press \n yes -> to delete\n no -> not to delete");
			String ss=scc.next();
			if(ss.equals("yes"))
			{
				del.delete();
				System.out.println("File deleted Successfully..!!");
			}else if(ss.equals("no"))
			{
				System.out.println("You have chosen . not to delete the file.. ");
				System.out.println("to delete the file press yes");
				ss=scc.next();
				if(ss.equals("yes")) {
				del.delete();
				System.out.println("file deleted successfully..!!");}
				else {
					System.out.println("you have exausted with your given time period");
					System.out.println("so file can't be deleted");
					System.out.println("thank you");
				}
			}
			
		}else
		{
			System.out.println("file not present...");
		}
	}
}
