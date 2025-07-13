package Oops_AlgoPrep;
// multilevel inhertance of interface
interface I1{
	void fun1();
}
interface I2 extends I1{
	void fun2();
}
interface I3 extends I2{
	void fun3();
}
class V1 implements I3{

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("This is Fun1()");
		
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("This is Fun2()");
	}

	@Override
	public void fun3() {
		// TODO Auto-generated method stub
		System.out.println("This is Fun3()");
	}
	
}
// multiple interiance of interface
interface A11{
	void f1();
}
interface A2{
	void f2();
}
interface I4 extends A11,A2{
	void f3();
}
class K implements I4{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("This is f1()");
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("This is f2()");

	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("This is f3()");

	}
	
}


public class InterfaceInheritance {
	public static void main(String[] args) {
		V1 v=new V1();
		v.fun1();
		v.fun2();
		v.fun3();
		
		K k=new K();
		k.f1();
		k.f2();
		k.f3();
	}
}


