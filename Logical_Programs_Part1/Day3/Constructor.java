package Day3;

class thread extends Thread{
	public void run()
	{
		System.out.println("hello");
	}
}
class a {
	public a()
	{
		System.out.println("a ");
	}
}
class b extends a{
	public b()
	{
		System.out.println("b");
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b bb=new b();
thread t=new thread();
t.start();
//t.stop();
//t.start();


Integer a=128, b=128;
System.out.println("helo"+(a==b));

	}

}
