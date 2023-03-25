package day1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Create_Operation {

	public static void main(String[] args) {
		try {
		File cf=new File("Terrace.java");
//		if(cf.createNewFile()) {
//			System.out.println("file created successfully"+cf.getAbsolutePath()+"  "+cf.getName());
			FileWriter fw=new FileWriter("Terrace.java");
			fw.write("Hello good morning\n");
			fw.write("Happy Maha-Shivarathri");
			fw.close();
			
			
//		}
//		else
//		{
//			System.out.println("file exists already..!");
//		}
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}

	}

}
