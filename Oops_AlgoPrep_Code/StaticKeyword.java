package Oops_AlgoPrep;

class S{
	String name;
	int rollno;
	static String schname;
	static void lunchtime() {
		System.out.println("lunchtime is on afternoon time");
	}
}
public class StaticKeyword {
	public static void main(String[] args) {
		S s1=new S();
		s1.name="Aditya Raj";
		s1.rollno=10;
		s1.schname="DMPS";
		
		S s2=new S();
		s2.name="Shitanshu";
		s2.rollno=20;
		
		System.out.println(s1.name+" "+s1.rollno+" "+s1.schname);
		System.out.println(s2.name+" "+s2.rollno+" "+s2.schname);
		System.out.println(S.schname);
		S.lunchtime();
		
	}
}
