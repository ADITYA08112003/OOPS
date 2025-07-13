package Oops_AlgoPrep;

class A{
//	Private Access Modifier
	private int a;
	private String str;
	A(int a,String str){
		this.a=a;
		this.str=str;
	}
	public int Geta() {
		return a;
	}
	public String Getstr() {
		return str;
	}
//	Default Access Modifier
	int b;
	int c;
	String str1;
	A(int b,int c,String str1){
		this.b=b;
		this.c=c;
		this.str1=str1;
	}
	public int Getb() {
		return b;
	}
//	Public Access Modifier
	public int d;
	public String s1;
	public String s2;
	A(int d,String s1,String s2){
		this.d=d;
		this.s1=s1;
		this.s2=s2;
	}
}
public class AccessModifier {
	public static void main(String[] args) {
		A s11=new A(100,"Aditya");
		System.out.println(s11.Geta()+" "+s11.Getstr());
		A s21=new A(199,123,"Shitanshu");
		System.out.println(s21.b+" "+s21.c+" "+s21.str1+" "+s21.Getb());
		A s3=new A(99,"Aditya","Shitanshu");
		System.out.println(s3.d+" "+s3.s1+" "+s3.s2);
	}
}
