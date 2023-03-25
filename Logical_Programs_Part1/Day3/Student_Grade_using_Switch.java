package Day3;



public class Student_Grade_using_Switch {

	public static void main(String[] args) {
		int n=30;
		switch(n)
		{
		case 90: 
			System.out.println("A grade");
			break;
		case 75: 
			System.out.println("B grade");
			break;
		case 65: 
				System.out.println("C grade");
			break;
		case 40:
			System.out.println("D Grade");
		default: System.out.println("F grade");
		break;
		}

	}

}
