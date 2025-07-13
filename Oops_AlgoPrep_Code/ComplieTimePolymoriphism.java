package Oops_AlgoPrep;

class Z{
	void check(int x) {
		System.out.println("This is check of one variable");
	}
	void check(int x,int y) {
		System.out.println("This is check of two variable");
	}
	void check(String str) {
		System.out.println("This is check of one variable with different parameter");
	}
	void check(int x,String str) {
		System.out.println("This is check of two variable with different parameter");
	}
}
public class ComplieTimePolymoriphism {
	public static void main(String[] args) {
		Z z=new Z();
		z.check(100);
		z.check("Aditya");
		z.check(1000,200);
		z.check(100,"Shitanshu");
	}
}
