package javaIODemos;
import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	File file=new File("data.txt");
        	FileOutputStream fout= new FileOutputStream(file);
        	BufferedOutputStream bout=new BufferedOutputStream(fout);
        	DataOutputStream dout=new DataOutputStream(bout);
        	dout.writeBytes("Cheacking FileOutputStream class");
        	dout.flush();//to store the data permanently
        	dout.close();
        }
        catch(IOException e)
        {
        	System.out.println(e.getMessage());
        }
	}

}
