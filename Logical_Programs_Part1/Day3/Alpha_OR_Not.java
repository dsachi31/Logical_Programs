package Day3;

public class Alpha_OR_Not {

	public static void main(String[] args) {
		char c='g';
		if((c>='A' && c<='Z')|| ( c>='a' && c<='z')|| (c>='0' && c<='9')) {
			System.out.println("Is not Special Character");
		}
		else
		{
			System.out.println("is special character");
		}
//		if(c>='A' && c<='Z')
//		{
//			System.out.println("Caps present");
//		}else
//		{
//			System.out.println("not present");
//		}
//		if(c>='0' && c<='9') {
//			System.out.println("Is number..!");
//		}
//		else
//		{
//			System.out.println("Not a Number");
//		}

	}

}
