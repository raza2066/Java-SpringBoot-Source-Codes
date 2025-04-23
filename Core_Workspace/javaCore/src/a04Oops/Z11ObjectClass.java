package a04Oops;

import java.util.Objects;

class ObjectClass{
	
	int var1;
	String var2;
	@Override
	public int hashCode() {
		return Objects.hash(var1, var2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		return var1 == other.var1 && Objects.equals(var2, other.var2);
	}
	
	 
	
}

public class Z11ObjectClass {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		obj1.var1 = 101;
		obj1.var2 = "str101";
		
		ObjectClass obj2 = new ObjectClass();
		obj2.var1 = 101;
		obj2.var2 = "str101";
		
		
		System.out.println(obj1.toString());      //inbuilt toString gives className+hexadecimal hashCode of the object
		boolean result1 = obj1==obj2;
		boolean result2 = obj1.equals(obj2);      //default equal will return false. we have to create a new equals function.
		
		System.out.println(result1);
		System.out.println(result2);
	}
}