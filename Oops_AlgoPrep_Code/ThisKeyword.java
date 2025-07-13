package Oops_AlgoPrep;

class Pair{
	int a;
	int b;
	
	Pair(int a,int b){
		this.a=a;
		this.b=b;
	}
	void fun1() {
		System.out.println("This is fun1 method:"+a);
		this.fun2();
	}
	void fun2() {
		System.out.println("This is fun2 method:"+b);
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		Pair p=new Pair(100,200);
		p.fun1();
	}
}
