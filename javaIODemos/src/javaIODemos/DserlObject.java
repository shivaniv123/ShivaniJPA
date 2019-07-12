package javaIODemos;

import java.io.*;


public class DserlObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			File file=new File("serl.txt");
			FileInputStream fin=new FileInputStream(file);
			ObjectInputStream bin=new ObjectInputStream(fin);
			Student stu =(Student)bin.readObject();
			System.out.println(stu);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
