package day1;

public class Armstrong {

	
	public static void arm(int num)
	{
		int rem=0,res=0;
		while(num>0)
		{
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
		}
		if(res==num)
		{
			System.out.println(num+ " is Armstrong");
		}
		else
		{
			System.out.println(num+ " is Not Armstrong");	
		}
	}
	public static void main(String[] args) {
		arm(153);
		

	}

}
