package day1;

import java.io.File;

public class File_delete_operation {

	public static void main(String[] args) {
		String filename="Alphabet2.java";
		String switchDirectory = System.getProperty("user.dir");
		System.out.println(switchDirectory);
		
		File ff=new File("F:\\File_Operations_java 2");
		
		ff.mkdir();
		
		System.out.println("directory created..");
		try {
		File f=new File(switchDirectory, filename);
		System.out.println(filename);
		if(f.createNewFile()) {
			System.out.println("new file created");	
		}
		else
		{
			System.out.println("Already file exists");
		}}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
