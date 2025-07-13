package Oops_AlgoPrep;

//Parent Class of Child and GrandChild
class Dad{
	int dadmoney;
	void Dadproperty() {
		System.out.println("This is Dad Property");
	}
}
//Child class of Dad
//Parent class of GrandChild
class Child extends Dad{
	int childmoney;
	void Childproperty() {
		System.out.println("This is Child Property");
	}
}
//Child class of Child
//Child Class of Dad
class GrandChild extends Child{
	int grandchildmoney;
	void GranChildProperty() {
		System.out.println("This is GrandChild Property");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		System.out.println("Dad");
		Dad d=new Dad();
		d.dadmoney=1000;
		System.out.println(d.dadmoney);
		d.Dadproperty();
		
		System.out.println("Child");
		Child c=new Child();
		c.childmoney=2000;
		System.out.println(c.childmoney);
		c.Childproperty();
		System.out.println(c.dadmoney);
		c.Dadproperty();
		
		System.out.println("GrandChild");
		GrandChild gc=new GrandChild();
		gc.grandchildmoney=3000;
		System.out.println(gc.grandchildmoney);
		gc.GranChildProperty();
		System.out.println(gc.childmoney);
		gc.Childproperty();
		System.out.println(gc.dadmoney);
		gc.Dadproperty();
	}
}
