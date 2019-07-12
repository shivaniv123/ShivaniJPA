package lab3;
import java.util.Arrays; 
import java.util.Scanner;

public class Alphabet {
	
	 
	  
	 
	    static boolean isAlphabaticOrder(String s)  
	    {  
	        
	        int n = s.length(); 
	        char c[] = new char [n];  
	        
	        for (int i = 0; i < n; i++)
	        {  
	            c[i] = s.charAt(i);  
	        }  
	        
	      
	        Arrays.sort(c);  
	        for (int i = 0; i < n; i++)  
	            if (c[i] != s.charAt(i))   
	                return false;  
	                
	        return true;      
	    }  
	      
	    public static void main(String args[]) 
	    { 
	    	System.out.println("Enter a string  :");
	    	Scanner sc=new Scanner(System.in);
	        String s =sc.next();
	        if (isAlphabaticOrder(s))  
	           System.out.println(s+" is well order");  
	        else
	            System.out.println(s+" is not well ordered");  
	            
	    } 
}
	   
	
