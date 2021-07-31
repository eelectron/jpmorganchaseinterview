package package1;

import java.io.FileNotFoundException;
import package2.B;

public class A{
	protected int a = 1;

	public static void main()throws FileNotFoundException{
		A a =  new B();
		a.accessVar();
		//a.hello();

		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)((byte)b1 + (byte)b2);

		System.out.println(b3);

		Integer i1 = 1000, i2 = 1000;
		Integer i3 = 100, i4 = 100;

		System.out.println(i1 == i2);  // true
		System.out.println(i3 == i4);  // true

		//String s1 = "abc";					 "abc" constant pool
		String s2 = new String("abc");       // "abc"
	}

	public void accessVar() throws FileNotFoundException{
		A objA = new A();
		System.out.println(objA.a);
	}
}