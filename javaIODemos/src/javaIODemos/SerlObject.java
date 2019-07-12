package javaIODemos;
import java.io.*;
public class SerlObject {

	public static void main(String [] args)
	{
		try{
			File file=new File("serl.txt");
			FileOutputStream fout=new FileOutputStream(file);
		ObjectOutputStream bout=new ObjectOutputStream(fout);
		Student stu=new Student(12,"vijay","mumbai");
		bout.writeObject(stu);
		bout.flush();
		bout.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
