package Day2;

import java.util.ArrayList;
import java.util.Collections;

class into implements Comparable<into>{
	public into(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
//	@Override
//	public int compareTo(into o)
//	{
//		return this.id-o.id;
//	}
//	
	
	
	//sorting by name
	@Override
	public int compareTo(into o)
	{
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "into [id=" + id + ", name=" + name + "]";
	}
	int id;
	String name;
	
}
public class Comparable_class {

	public static void main(String[] args) {
		
		ArrayList<into> l=new ArrayList<into>();
l.add(new into(2,"divya"));
l.add(new into(1,"thankoo"));
l.add(new into(3,"mitun"));
Collections.sort(l);
System.out.println(l);
	}

}
