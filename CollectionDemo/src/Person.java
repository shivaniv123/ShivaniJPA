
public class Person {
        String name;
        String address;
       
		public Person(String name, String address) {
			super();
			this.name = name;
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", address=" + address + "]";
		}
        @Override
        public boolean equals(Object obj)
        {
        	boolean flag=false;
        	if(obj instanceof Person)
        	{
        		Person p=(Person)obj;
        		if(this.name.equals(p.name)&& this.address.equals(p.address));
        		flag=true;
        	}
        	return flag;
        }
        @Override
        public int hashCode()
        {
        	return name.length();
        }
		
        
        
        
}
