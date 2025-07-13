package Oops_AlgoPrep;

abstract class H{
	int val;
	void fun1() {
		System.out.println("This is fun1()");
	}
	abstract void fun2();
}
class L extends H{

	@Override
	void fun2() {
		// TODO Auto-generated method stub
		System.out.println("This is fun2()");
	}
}

public class AbstractKeyword {
	public static void main(String[] args) {
		L l=new L();
		l.fun1();
		l.fun2();
	}
}
