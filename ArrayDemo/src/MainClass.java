
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1));
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,4));
         int [] arr=new int [] {1,2,3,4,5};
         String str[] = {"abc","xyz","rty"};
         
         for(int ele : arr)//for-each
         {
        	 System.out.println(ele);
        	 
         }
         for (int i=0;i<str.length;i++)
         {
        	 System.out.println(str[i]);
         }
	}
	public static int add(int ...arr)
	{
		int sum=0;
		for(int x : arr)
		{
			sum=sum + x;
			
		}
		return sum;
	}

}
