package javaIODemos;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		File file=new File("data.txt");
		
		try{
			FileInputStream fin= new FileInputStream(file);
        	BufferedInputStream bin=new BufferedInputStream(fin);
        	DataInputStream din=new DataInputStream(bin);
		 int c=0;
		 do
		 {
			 c=din.read();
			 char ch=(char)c;
			 System.out.print(ch);
		 }while(c!=-1);
		}
		catch(IOException e)
        {
        	System.out.println(e.getMessage());
        }
	}

}
