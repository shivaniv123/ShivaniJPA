
public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="Capgemini";
     String str2="India";
     
     System.out.println("str1 toLowerCase = "+str1.toLowerCase());
     System.out.println("str2 toUpperCase() = "+str2.toUpperCase());
     System.out.println("str1 CharAt 5 ="+str1.charAt(5));
     System.out.println("str Index of i ="+str1.indexOf("i"));
     System.out.println("str1 last index of i ="+str1.lastIndexOf("i"));
     System.out.println("str concat str2 ="+str1.concat(str2));
     System.out.println("str1 substring  2 to 5 ="+str1.substring(2,5));
     System.out.println("str1 compare str2 ="+str1.compareTo(str2));
     System.out.println("str1="+str1);
	}

}
