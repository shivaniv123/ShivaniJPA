package lab3;

import java.util.Scanner;
import java.lang.*;

public class UserChoice {

	public static void main(String[] args)
	{
		
		int i;
		int len;
		String ans="";
		String str="Capgemini";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Select your Choice");
		System.out.println("------------------");
		System.out.println("1.Add the String to itself");
		System.out.println("2.Replace odd positions with # ");
		System.out.println("3.Remove duplicate characters in the String");
		System.out.println("4.Change odd characters to upper case");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1: System.out.println(str.concat(str));
		        break;
		 
		case 2:
		{ 
			for( i=0; i<str.length(); i++)
			{
	        char currChar = sb.charAt(i);
	        int id = str.indexOf(currChar);
	        
	        if (i%2==1)
	         {
	        	sb.setCharAt(i ,'#' );
	   
	          }

	        }System.out.println(sb);
	               
		}
		break;
		case 3:{len=str.length();
		 String result = "";
		    for (i = 0; i < str.length(); i++) {
		        if(!result.contains(String.valueOf(str.charAt(i)))) {
		            result += String.valueOf(str.charAt(i));
		        }
		    }
		  System.out.println(result); 
		}break;
		case 4:{
			for ( i = 0, len = str.length(); i < len; i++) {
			    char ch = str.charAt(i);
			    if (i % 2 == 0) {
			        System.out.print(Character.toLowerCase(ch));
			    } else {
			        System.out.print(Character.toUpperCase(ch));
			    }
			}
		}
		break;
		default:System.out.println("Wrong Choice....!!!!!");
			
		
		}

}
}

