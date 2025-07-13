package Oops_AlgoPrep;

class Test{
	private int p1;
	int p2;
//	Protected can be access through derived class with same package 
//	and derived class with across the package but not across the package
	protected int p3;
	public int p4;
}
class T extends Test{
	void Check() {
		T a1=new T();
		a1.p3=1000;
		System.out.println(a1.p3);
	}
}

public class ProtectedAccessModifier {
	public static void main(String[] args) {
		T a2=new T();
		a2.Check();
	}
}
