package package2;

import package1.A;

public class B extends A{

	public void accessVar(){
		A objA = new A();
		//System.out.println(objA.a);
		System.out.println(a);

		synchronized (this){
			System.out.println(a);
		}
	}

	public void hello(){

	}
}