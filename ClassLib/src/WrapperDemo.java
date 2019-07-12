
public class WrapperDemo {

	public static void main(String[] args) {
		float data =4.5f;
		//Float obj= new Float(data);
		Float obj=data;//autoboxing
		System.out.println("data ="+data);//boxing
		System.out.println("obj ="+obj);
		
		//float val= obj.floatValue();//unboxing
		float val=obj;//autounboxing
		System.out.println("val ="+val);
				// TODO Auto-generated method stub

	}

}
