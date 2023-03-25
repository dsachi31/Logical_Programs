package day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IceCream 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> hm= new HashMap<String, String>();
		hm.put("ice-cream", "peanuts");
		hm.put("pancake", "syrup");
		hm.put("Gobi","Noodles");
		System.out.println(hm);
		int iiin=0101;
		System.out.println(iiin);
		
//		 Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();
//		 while(itr.hasNext())
//		 {
//			 System.out.println();
//			Map.Entry<String, String> v= itr.next();
//			 if(v.getKey().equals(("ice cream")))
//			 {
//				 v.setValue("cherry");
//			 }
//		 }
//		 hm.put("bred", "butter");
//		 System.out.println(hm);
	}

}
