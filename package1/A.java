package package1;

import java.io.*;
import package2.B;

public class A{
	protected int a = 1;

	public static void main(String[] args)throws IOException{
		A a =  new B();
		a.accessVar();
		//a.hello();

		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)((byte)b1 + (byte)b2);

		System.out.println(b3);

		Integer i1 = 1000;
		Integer i2 = 1000;
		Integer i3 = 100;
		Integer i4 = 100;

		Integer i5 = 200;
		Integer i6 = 200;

		System.out.println("i1 == i2 ? " + (i1 == i2));  // false
		System.out.println("i3 == i4 ?" + (i3 == i4));  // true
		System.out.println("i5 == i6 ?" + (i5 == i6));  // false

		String s1 = "abc";					 //"abc" constant pool
		String s2 = new String("abc");       // "abc"
		System.out.println("s1 == s2 ?" + (s1 == s2));  // true
	}

	public void accessVar() throws IOException{
		A objA = new A();
		System.out.println(objA.a);
	}
}