package Oops_AlgoPrep;

class X{
	void check() {
		System.out.println("This is check of X");
	}
}
class Y extends X{
	void check() {
		System.out.println("This is check of Y");
	}
}
class V extends X{
	void check(int v) {
		System.out.println("This is check of V");
	}
}
public class RunTimePolymoriphism {
	public static void main(String[] args) {
		X x=new X();
		x.check();
		
		Y y=new Y();
		y.check();
		
		V v=new V();
		v.check();
		v.check(10);
	}
}
