package Oops_AlgoPrep;

class Student{
	String name;
	int yob;
	public int check() {
		return yob;
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.yob+" "+s1.name);
		s1.yob=1990;
		s1.name="Aditya";
		System.out.println(s1.yob+" "+s1.name);
		System.out.println(s1.check());
		Student s2=new Student();
		s2.yob=1999;
		s2.name="Shitanshu";
		System.out.println(s2.yob+" "+s2.name);
		System.out.println(s2.check());
	}
}
