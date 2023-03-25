package Day3;

public class Armstrong {

	public static void check(int num)
	{
		int temp=num;
		int c=0,rem=0,sum=0;
		while(temp>0){
		c++;
		temp=temp/10;
		}
		temp=num;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(int)Math.pow(rem, c);
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
	public static void main(String[] args) {
		check(153);

	}

}
