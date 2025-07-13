package Oops_AlgoPrep;

class Student1{
	String name;
	int yob;
	public int check() {
		return yob;
	}
//	constructor
	
	Student1(){
//	Default Construct	
	}
	Student1(String s1,int y){
//		Parameteric Constructor
		name=s1;
		yob=y;
	}
	Student1(Student1 s1){
//		Copy Constructor
		name=s1.name;
		yob=s1.yob;
	}
}

public class Constructor {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		System.out.println(s1.name+" "+s1.yob);
		s1.name="AdiShi";
		s1.yob=2000;
		System.out.println(s1.name+" "+s1.yob);
		Student1 s2=new Student1(s1);
		System.out.println(s2.name+" "+s2.yob);
	}
}
