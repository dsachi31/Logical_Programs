package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class cartoon implements Comparable<cartoon>
{
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cartoon other = (cartoon) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	public cartoon(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "cartoon [id=" + id + ", name=" + name + "]";
	}
	int id;
	String name;
	
	
	
	
	
	@Override
	public int compareTo(cartoon o) 
	{
		return this.name.compareTo(o.name);
	}
}
public class Comparator_class {

	public static void main(String[] args) {
		cartoon c=new cartoon(100,"Mr.Bean");
		cartoon c2=new cartoon(400,"Chota Bheem");
		cartoon c3=new cartoon(400,"Chota Bheem");
		System.out.println(c.equals(c2));
		System.out.println();
//		ArrayList<cartoon> c=new ArrayList<cartoon>(); 
//		c.add(new cartoon(100,"Mr.Bean"));
//		c.add(new cartoon(300,"Tom & Jerry"));
//		c.add(new cartoon(400,"Chota Bheem"));
//		c.add(new cartoon(200,"Doraemon"));
//		c.add(new cartoon(400,"Chota Bheem"));
//		Collections.sort(c);
//		System.out.println(c);
//		for(cartoon obj: c)
//		{
//			System.out.println(obj.hashcode());
//		}
	}

}
