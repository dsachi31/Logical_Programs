package Day5;

import java.util.Scanner;

public class StrongPassword {
	
	public static void strong(String p)
	{
		char[] c=p.toCharArray();
		int count=0,count2=0,count3=0,count4=0,tot=0;
		if(c.length==6)
		{ 
			for(int i=0; i<c.length; i++)
			{
				if(((int)c[i]>='!' && (int)c[i]<='/') || ((int)c[i]>=':' && (int)c[i]<='@') || ((int)c[i]>='[' && (int)c[i]<='`') || ((int)c[i]>='{' && (int)c[i]<='~'))
				{
					count++;
				}
				if(((int)c[i]>='0' && (int)c[i]<='9'))
				{
					count2++;
				}
				
				if(((int)c[i]>='A' && (int)c[i]<='Z')) {
					count3++;
				}
				
				if(((int)c[i]>='a' && (int)c[i]<='z')) {
					count4++;
				}
				
//				if((c[i]<='!' && c[i]>='/')|| (c[i]<='0' && c[i]>='9')|| (c[i]<=':' && c[i]>='@')
//						||(c[i]<='A' && c[i]>='Z')|| (c[i]<='[' && c[i]>='`') || (c[i]<='a' && c[i]>='z')||
//						(c[i]<='{' && c[i]>='~')) {
//					System.out.println("strong");
//				}
				
			}
			
			if(count>=1 && count2>=1 && count3>=1 && count4>=1) {
				tot=count+count2+count3+count4;
				System.out.println(tot);
//				System.out.println("strong");
				
			}else
			{
				System.out.println("weakkkkkkkk");
				System.out.println("it should be strong ppassword");
			}
			
			if(tot==6)
			{
				System.out.println("strong password");
			}
			else
			{
				System.out.println("weak password");
			}
		}
			else
		{
			System.out.println("weak");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password");
		String p=sc.nextLine();
		strong(p);
	}

}
