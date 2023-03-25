package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class into implements Comparable<into>{
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public into(int id, String name,String address,double sal) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
		this.sal=sal;
	}
	int id;
	String name;
	String address;
	double sal;
	
//public int compareTo(into i) {
//		 if(id>i.id) {
//			return 1;
//		}else if(id<i.id) {
//			return -1;
//		}
//		 return 0;
//	}
	
	public int compareTo(into in)
	{
		return this.name.compareTo(in.name); 
	}
	@Override
	public String toString() {
		return this.id + " "+ this.name +" "+this.address+" "+this.sal+"\n";
	}
	
	
}

class into2 implements Comparator<into>{
	public int compare(into a, into b) {
		return a.address.compareTo(b.address);
	}
}
class into3 implements Comparator<into>{
	public int compare(into aa, into bb) {
//		if(aa.sal - bb.sal !=0)
//		{
//			return (int)aa.sal - (int)bb.sal;
//		}else
//		{
//			return  aa.address.compareTo(bb.address);
//		}
		
		if(aa.address.compareTo(bb.address)==0) {
			return (int)aa.sal - (int)bb.sal;
		}
		else
		{
			return aa.address.compareTo(bb.address);
		}
	}
}
public class main_comp {

	public static void main(String[] args) {
	 ArrayList<into> a=new ArrayList<into>(); 
	 a.add(new into(10,"Aaaa","Delhi",150000.45));
	 a.add(new into(20,"zzzz","Delhi",50000.45));
	 a.add(new into(50,"gggg","London",50000.45));
	 a.add(new into(30,"ppp","China",50000.45));
//	 Collections.sort(a);
//	 System.out.println(a);
//	 into2 in=new into2();
//	 Collections.sort(a,in);
//	 System.out.println(a);
	 into3 r=new into3();
	 Collections.sort(a,r);
	 System.out.println(a);
	 
	 
	}

}
