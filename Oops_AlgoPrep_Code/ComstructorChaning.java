package Oops_AlgoPrep;

class A1{
	int a;
	A1(){
//		super(); this is not Important for it
		System.out.println("This is Constructor of A");
	}
}
class B extends A1{
	int b;
	B(int x){
		b=x;
		System.out.println("This is Constructor of B with assign Value");
	}
	B(){
//		super();this is call of default constructor of parent class
		System.out.println("This is Constructor of B");
	}
}
class C extends B{
	int c;
	C(){
//		super();this is call of default constructor of parent class
		System.out.println("This is Constructor of C");
	}
}
class D extends B{
		int d;
		D(){
			super(10);
			System.out.println("This is Constructor of D");
//			super(); this is not written below process 
//			only super() is as first line of Contsructor
//			two super() are not written in constructor
		}
}
public class ComstructorChaning {
	public static void main(String[] args) {
		C c=new C();
		System.out.println();
		D d=new D();
	}
}
