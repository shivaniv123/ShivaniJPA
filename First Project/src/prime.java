
public class prime {

	public static void main(String[] args) {
				
		       int i =0;
		       int num =0;
		       //Empty String
		       String  prime = "";

		       for (i = 1; i <= 1000; i++)         
		       { 		  	  
		          int counter=0; 	  
		          for(num =i; num>=1; num--)
			  {
		             if(i%num==0)
			     {
		 		counter = counter + 1;
			     }
			  }
			  if (counter ==2)
			  {
			     //Appended the Prime number to the String
			     prime = prime + i + " ";
			  }	
		       }	
		       System.out.println("Prime numbers from 1 to 1000 are :");
		       System.out.println(prime);
		   }
		}
		// TODO Auto-generated method stub

	