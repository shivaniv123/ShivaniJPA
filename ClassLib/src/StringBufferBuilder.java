
public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuffer buffer=new StringBuffer("India");
      System.out.println("before buffer = "+buffer);
      buffer.append("Capgemini");
      System.out.println("after buffer =  "+buffer);
      
      StringBuilder build=new StringBuilder("History");
      System.out.println("before = "+build);
      build.append("Civics");
      System.out.println("after = "+build);
     
	}

}
